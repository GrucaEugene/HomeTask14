package com.technical.eleven.controllers;

import com.technical.eleven.exceptions.HumanExistsException;
import com.technical.eleven.exceptions.HumanNotExistsException;
import com.technical.eleven.exceptions.HumanNotFoundException;
import com.technical.eleven.services.HumanService;
import com.technical.eleven.services.OptionalHumanService;
import com.technical.eleven.ui.HumanConsoleUI;
import com.technical.eleven.ui.HumanUI;
import java.util.Scanner;

public class HumanController {
   private final HumanUI humanUI = new HumanConsoleUI(new Scanner(System.in));
   private final HumanService service = new OptionalHumanService();

   public void addHuman() {

      try {
         service.addHuman(humanUI.readHuman());
      } catch (HumanExistsException e) {
         humanUI.showHumanExistsError(e.getHuman());
      }
   }

   public void showAllHumans() {
      humanUI.showHumans(service.getWholeList());
   }

   public void removeFromList() {
      try {
         service.removeHumanByNumber(humanUI.getIndexOfHuman());
      } catch (HumanNotExistsException e) {
         humanUI.showHumanNotExistsError(e.getNumber());
      }
   }

   public void findBySurname() {
      System.out.println("---------------------------------");
      try {
         humanUI.showHuman(service.findBySurname(humanUI.readSurname()));
      } catch (HumanNotFoundException e) {
         humanUI.showHumanNotFoundError(e.getSearchValue(), "surname");
      }
   }

   public void findByName() {
      System.out.println("---------------------------------");
      try {
         humanUI.showHuman(service.findByName(humanUI.readName()));
      } catch (HumanNotFoundException e) {
         humanUI.showHumanNotFoundError(e.getSearchValue(), "name");
      }
   }

}



