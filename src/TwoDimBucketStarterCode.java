
import java.util.Arrays;


public class TwoDimBucketStarterCode {

    public static void main(String[] args) {
        //int[] heights = {1, 3, 4};
        int[] heights = {3,5,4,8,7};

        System.out.println("max height should be 3, and it is " + findMaxArea(heights));
    }

    /***
     * Input for your maxArea function will be an integer array: height
     * For each element of height: height[i], imagine you draw a vertical line
     * starting at coordinate (i,0) and ending at coordinate (i, height[i]).
     * That is, this line is at x-coordinate i, and its height is height[i].
     * You can choose any pair of vertical lines, and imagine a 2-dimensional
     * bucket between those lines.  This bucket will have its base at the
     * x-axis.  The output of your maxArea will be the largest 2-dimensional
     * area that we can "fill with water."
     * @param height int array giving heights of vertical lines
     * @return max area that we can "fill with water" using two of those vertical lines
     */
    public static int findMaxArea(int[] height) {
        int max=0; //areaMax
        int currMax=0; // current max value
        int minY;

        for(int i=0;i<height.length;i++){
            int[] comboArray1 = new int[]{i, height[i]};
            System.out.println("combo1 is"+(Arrays.toString(comboArray1)));
            for (int j=i+1;j<height.length;j++){
                int[] comboArray2 = new int[]{j, height[j]};
                System.out.println("combo2 is"+(Arrays.toString( comboArray2)));

                if(height[j]<height[i] || height[j]==height[i]){
                    minY=height[j];
                }else{
                    minY=height[i];
                }
                    currMax= minY*(Math.abs(i-j));
                    System.out.println(currMax);
                    if (currMax>max){
                        max=currMax;
                    }

                }


            }
        
        
        
        
        
        
        
        /*Map<Integer,Integer> coordMap= new HashMap<Integer,Integer>();  //declare hashmap

        for (int i=0; i<height.length;i++){                             //intialize a map of x-y coordinates
            coordMap.put(i, height[i]);
        }

        for (Integer j : coordMap.keySet()) {
            int yVal= coordMap.get(j);
            System.out.println(j + "," + yVal);

        }8*/



        /***
         * You Code goes here!
         */


        /*for (int i=0;i<height.length;i++){      //index of array aka x value
            for (int j=0;j<i;j++){              //

            }
            }

        }*/

        return max;
    }
}
