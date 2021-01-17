package com.technical.eleven.controllers;

import com.technical.eleven.services.HumanService;
import com.technical.eleven.ui.HumanConsoleUI;
import com.technical.eleven.ui.HumanUI;

import java.util.Scanner;

public class HumanController {
   private final HumanUI humanUI = new HumanConsoleUI(new Scanner(System.in));
   private final HumanService service = new HumanService();

   public void addHuman(){
       service.addHuman(humanUI.readHuman());
   }

   public void showAllHumans(){
      humanUI.showHumans(service.getWholeList());
   }

   public void removeFromList(){
      service.removeHumanByNumber(humanUI.getIndexOfHuman());
   }

   public void findBySurname(){
      service.findBySurname(humanUI.readSurname());
   }

   public void findByName(){
      service.findByName(humanUI.readName());
   }




}
