package training_mine.Flipgrid;


public class AgentInfo {

    //  Movie:  Jason Bourne

    public String agentName;
    private int agentID ; // data hiding

    private final String projectName = "Operation Treadstone"; //  PI=3.14 ;  g = 9.8



    public int getAgentID() {  // read only
        return agentID;
    }

    public void setAgentID(int agentID) {  // write only
        this.agentID = agentID;
    }

    public String getProjectName() {   // read only
        return projectName;
    }

   /*
     public void setProjectName(String projectName) {  // we cannot modify it
        this.projectName = projectName;
    }

    */









}


class test{

    public static void main(String[] args) {

        AgentInfo agent1 = new AgentInfo();
        agent1.agentName = "Jason Bourne"; // coz public

        //  agent1.agentID   = 1993;       // coz private
        agent1.setAgentID( 1993 );  //  setID

        // agent1.setProjectName("VyTrack");  // variable setProjectName is private, final and we cannot modify it


        System.out.println("Agent name is: " + agent1.agentName +  " >>>>>> direct access");
        System.out.println( "Agent ID is:  " + agent1.getAgentID()  +" >>>>>> by getter and setter");
        System.out.println("Project name for all agents: " + agent1.getProjectName()  +" >>>>>> by getter only" );


    }

}
