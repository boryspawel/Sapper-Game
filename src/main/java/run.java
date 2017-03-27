
import modulew.MainFrame;
import modulew.Workspace;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Abcd on 2017-03-16.
 */
public class run {




    public static void main(final String[] args){

         final int workspaceDimension =10;
         final int bombsQuantity =20;

         Workspace workspace =new Workspace(workspaceDimension);




        Integer[][] workSpaceArray=workspace.Workspace();


      for (int i =1; i< workspaceDimension+1; i++) {
          for (int j = 1; j < workspaceDimension+1; j++) {

             if(workSpaceArray[i][j]==-1){
                  System.out.print("b");
              }else{
                  System.out.print(workSpaceArray[i][j]+" ");
             }

          }
          System.out.println(" ");
      }
        new MainFrame("SAPER", workspaceDimension, workSpaceArray);
//        MainFrame.addButtons();
//        MainFrame.display();

    }

}



