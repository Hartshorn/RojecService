package com.RojecService.database;

import com.RojecService.dto.Request;
//option only needed for main (testing)
import com.RojecService.dto.Option;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

import java.io.IOException;


public class RojecDatabase {

  public enum Status { ERROR, OK }

  private static List<RojecDataItem> data = new ArrayList<>();
  private static Status status;
  private static Random rng = new Random();

  private static final String dbf = "com.RojecService.database\\db.txt";
  final static Charset ENCODING = StandardCharsets.UTF_8;

  public RojecDatabase() {
    //read in db files;
    if(load()) {
      this.status = Status.OK;
    } else {
      // create a new db file here?  or throw an exception?
      this.status = Status.ERROR;
    }
  }

  public static Boolean processRequest(Request request) {

    switch (request.getOption().getChoice()) {

      case 1:
        showAllData();
        break;

      case 2:
        addData(request);
        break;

      default:
        System.out.println("BAD CHOICE ERROR");
        break;
    }

    return true;
  }

  private static boolean load() {

    Path path = Paths.get(dbf);

    try (Scanner scanner = new Scanner(path, ENCODING.name())) {

      while(scanner.hasNextLine()) {
        processLine(scanner.nextLine());
      }

    } catch (Exception e) {
      System.out.println(e.toString());

      return false;
    }
    return true;
  }

  private static boolean processLine(String line) {
    Scanner scanner = new Scanner(line);
    scanner.useDelimiter(",");

    if(scanner.hasNext()) {

      RojecDataItem item = new RojecDataItem();
      item.setId(Integer.parseInt(scanner.next()));
      item.setName(scanner.next());
      item.setCity(scanner.next());
      item.setState(scanner.next());

      return data.add(item);
    }
    return false;
  }

  private static boolean showAllData() {
    data.forEach((rdi) -> System.out.println(rdi.getId()
                                            + ":\t" + rdi.getName()
                                            + "\t" + rdi.getCity()
                                            + "," + rdi.getState()));
    return true;
  }

  private static boolean addData(Request request) {
    RojecDataItem item = new RojecDataItem();

    item.setId(generateId());
    item.setName(request.getOption().getName());
    item.setCity(request.getOption().getCity());
    item.setState(request.getOption().getState());
    data.add(item);

    try (BufferedWriter writer = new BufferedWriter(
                                  new OutputStreamWriter(
                                    new FileOutputStream(dbf), "utf-8"))) {
      for (RojecDataItem rdi : data) {
        writer.write(rdi.toString());
        writer.newLine();
      }
    } catch (IOException e) {
      return false;
    }

    return true;
  }

  private static Integer generateId() {
    return rng.nextInt(100);
  }
}
