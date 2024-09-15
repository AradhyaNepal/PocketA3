import 'package:flutter/material.dart';

enum HomeNavigationType{
  nature,
  codingA2,
  add,
  eReward,
  trophies;
static List<HomeNavigationType> getUIList()=>[
  nature,
  codingA2,
  add,
  eReward,
  trophies
];
  static List<BottomNavigationBarItem> homeItems()=>getUIList().map((e){
    return BottomNavigationBarItem(
      icon: Icon(
        e.mapToIcon(),
        color: e==add?Colors.transparent:null,
      ),
      label: e.mapToUI(),
    );
  }).toList();



  IconData mapToIcon(){
    return switch(this){
    nature=>Icons.ac_unit,
    codingA2=>Icons.computer,
    add=>Icons.add,
    eReward=>Icons.wb_incandescent_sharp,
    trophies=>Icons.wine_bar_outlined
    };
  }

  String mapToUI(){
    return switch(this){
      nature=>"Nature",
      codingA2=>"Coding A2",
      add=>"Add",
      eReward=>"E-Reward",
      trophies=>"Trophies"
    };
  }

}