
// print all the Permutation of a string 


import java.util.*;

class ImpRecProblem12{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str=sc.next();
        List<String> res = generatePermutation(str);
        System.out.println(res);
        
    }
    
    
    public static List<String> generatePermutation(String str ){
        List<String> res = new ArrayList<>();
        String current="";
        boolean [] markTaken= new boolean[str.length()];
        generate(str , current , res, markTaken);
        return res;
    }
    
    public static void generate(String str , String current , List<String> res , boolean [] markTaken){
        if(str.length()==current.length()){
            res.add(current);
        }
        for (int i =0 ; i<str.length(); i++){
            if(markTaken[i])continue;
            
            markTaken[i]=true;
            generate(str,current + str.charAt(i),res,markTaken);
            markTaken[i]=false;
        }
    }
}
