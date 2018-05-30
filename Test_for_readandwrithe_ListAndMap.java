package Text;/*
 *@ authour Gongsheng Yuan
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test_for_readandwrithe_ListAndMap {

        public void writeObject() {

            try {



                HashMap<String,String> map = new HashMap <String,String>();

                map.put("name", "foolfish");



                List<String> list = new ArrayList <String>();

                list.add("hello");

                list.add("everyone");





                FileOutputStream outStream = new FileOutputStream("D://1.txt");

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);



                objectOutputStream.writeObject(map);

                objectOutputStream.writeObject(list);

                outStream.close();

                System.out.println("successful");

            } catch (FileNotFoundException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }



        public void readObject(){

            FileInputStream freader;

            try {

                freader = new FileInputStream("D://1.txt");

                ObjectInputStream objectInputStream = new ObjectInputStream(freader);

                HashMap<String,String> map = new HashMap<String,String>();

                map = (HashMap<String, String>) objectInputStream.readObject();

                ArrayList<String> list = new ArrayList<String>();

                list = (ArrayList<String>) objectInputStream.readObject();

                System.out.println("The name is " + map.get("name"));

                System.out.println("aa " + list.get(1));

            } catch (FileNotFoundException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            } catch (IOException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            } catch (ClassNotFoundException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }



        }




        public static void main(String args[]){

            Test_for_readandwrithe_ListAndMap of = new Test_for_readandwrithe_ListAndMap();

            of.writeObject();

            of.readObject();

        }

    }
