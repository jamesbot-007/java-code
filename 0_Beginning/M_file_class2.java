import java.io.File;

public class M_file_class2 {

    public static void list_out_tree(File file){
            
       
         
         System.out.println(file.isDirectory());
         
         if(file.isDirectory()){
            System.out.println(file.getPath() + " is a Directory");
            
            String l[] = file.list(); 
            
            for(String f : l){
            
                File f1 = new File(file.getPath() + "/" + f);
        
                if(f1.isDirectory()){
                   list_out_tree(f1);
                }
                else {
                    System.out.println(f + " is a File");
                }
                
                
                
            }
            
        }
    }


    public static void main(String[] args) {

        /*
         * 
         File file = new File("directiory");
         
         System.out.println(file.isDirectory());
         
         if(file.isDirectory()){
            System.out.println(file.getPath() + " is a Directory");
            
            String l[] = file.list();  // returns String array of files and directories in the directory
            
            for(String f : l){
                // System.out.println(f);
                
                // if(f.isDirectory())
                // we can not use isDirectory() method because f is string and it is method of file object.

                // we need to create file object 
                File f1 = new File(file.getPath() + "/" + f);
                
                
                if(f1.isDirectory()){
                    System.out.println(f + " is a Directory");
                }
                else {
                    System.out.println(f + " is a File");
                }
                
                
                
            }
            
        }
        */

        // pack above code in recursive function
        File file = new File("../0_Beginning");
        list_out_tree(file);

        //  we can show it i tree like structure by modifying the print statements.

    }
}
