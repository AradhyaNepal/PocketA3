import 'package:flutter/material.dart';
import 'package:mobile/common/enum/home_navigation_type.dart';

class HomeNavigationScreen extends StatefulWidget {
  const HomeNavigationScreen({super.key});

  @override
  State<HomeNavigationScreen> createState() => _HomeNavigationScreenState();
}

class _HomeNavigationScreenState extends State<HomeNavigationScreen> {
  var selected=0;
  @override
  Widget build(BuildContext context) {
    return Scaffold(

      floatingActionButton: FloatingActionButton(
        onPressed: (){},
        child: const Icon(
          Icons.add
        ),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: selected,
        onTap: (index){
          selected=index;
          setState(() {
          });
        },
        selectedLabelStyle: const TextStyle(
          color: Colors.grey,
        ),
        unselectedLabelStyle: TextStyle(
          color: Colors.grey.shade700,
        ),
        selectedItemColor: Colors.grey,
        unselectedItemColor: Colors.grey.shade700,
        items:HomeNavigationType.homeItems(),
      ),
    );
  }
}
