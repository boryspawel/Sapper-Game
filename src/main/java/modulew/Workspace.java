package modulew;

/**
 * Created by Abcd on 2017-03-16.
 */
public class Workspace {


    protected static int workspaceDimension;
    protected  Integer[][] workSpaceArray;


    public Workspace(int workspaceDimension) {
        workSpaceArray = new Integer[workspaceDimension + 2][workspaceDimension + 2];

        this.workspaceDimension = workspaceDimension;


    }


    public static int getWorkspaceDimension() {
        return workspaceDimension;
    }

    public void setWorkspaceDimension(int workspaceDimension) {
        this.workspaceDimension = workspaceDimension;
    }

    public  Integer[][] getWorkSpaceArray() {
        return workSpaceArray;
    }

    public void setWorkSpaceArray(Integer[][] workSpaceArray) {
        this.workSpaceArray = workSpaceArray;


    }

    public  void buildWorkSpace(){

    for(int j = 0; j < ( workspaceDimension + 2); j++) {
            for (int i = 0; i < (workspaceDimension + 2); i++) {
                workSpaceArray[j][i] = 0;
            }
        }
        for (int i = 0; i < 20; i++) {
            workSpaceArray[(int) (Math.random() * workspaceDimension + 1)][(int) (Math.random() * workspaceDimension) + 1] = -1;
        }

        for (int i = 1; i < workspaceDimension + 1; i++) {
            for (int j = 1; j < workspaceDimension + 1; j++) {

                if (workSpaceArray[i][j] == -1) {
                    System.out.print("b");
                } else {

                }

            }
            System.out.println(" ");
        }

        for (int i = 1; i < (workspaceDimension + 1); i++) {
            for (int j = 1; j < (workspaceDimension + 1); j++) {
                int count = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int n = -1; n <= 1; n++) {

                        if (workSpaceArray[i + k][j + n] == -1) {
                            count++;
                        }
                        if (workSpaceArray[i][j] != -1) {
                            workSpaceArray[i][j] = count;
                        }

                    }

                }

            }

        }

    }

  }
