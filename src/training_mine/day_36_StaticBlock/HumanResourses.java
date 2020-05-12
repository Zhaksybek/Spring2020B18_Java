package training_mine.day_36_StaticBlock;

import training_mine.CustomClass.Scrum_team.Developer;

public class HumanResourses {



        static  Developer dev1= new Developer();
        static Developer dev2= new Developer();
        static Developer dev3= new Developer();
        static Developer dev4= new Developer();
        static Developer dev5= new Developer();

   static {
    dev1.setInfo("Aibek","Senior Dev",150_000,1982);
   }


}
