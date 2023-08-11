/**
 * <H2> LinearSearch </H2>
 *
 * @author Manan Sharma
 * @version 1
 * @since Friday, 11 of August, 2023; 21:20:51
 */

package io.github.drmanan.learn.search;

import io.github.drmanan.learn.commons.DataSet;

public class LinearSearch {
    public static void main(String[] args) {

        DataSet data= new DataSet(1000);
        int Search=9999;
        boolean IsFound=false;

        for(int i=0;i< data.getSize();i++){
            data.increaseTries();
            if(data.getData()[i]==Search){
                System.out.println("Element is found after "
                        + data.getTries() + " tries");
                IsFound=true;
                break;
            }
        }

        if(!IsFound){
            System.out.println("Element is not found");
        }
    }
}
