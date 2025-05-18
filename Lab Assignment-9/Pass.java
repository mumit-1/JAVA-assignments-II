public class Pass{
    public static void main(String[] args){
        String[] email_list = {"cse110@gmail.com", "government@cv.",  "eee@bracu.ac.bd"};
        int count = 0;

        for ( int i = 0; i<email_list.length ; i++) {
            boolean s1 = false;
            boolean s2 = false;
            boolean s3 = false;
            boolean s4 = false;
            int hehe =  -1;
            for ( int j = 0; j<email_list[i].length() ; j++) {
                if ( email_list[i].charAt(j) == '@' ) {
                    s1 = true;
                    hehe = j;
                }
            }
                if ( hehe >0 ) {
                    int need1 = hehe - 1;
                    int need2 = hehe + 1;
                    int before = (int)email_list[i].charAt(need1); 
                    int after = (int)email_list[i].charAt(need2);
                    if (((after >= 65 && after <= 90) || (after >= 97 && after <= 122) || (after >= 48 && after <= 57)   ) && ((before>= 65 && before<= 90) || (before >= 97 && before <= 122)  || (before>= 48 && before<= 57))){
                        s2 = true;
                    }
                }
                int need3=-1;
                for ( int k = hehe +1; k< (email_list[i].length() -1); k++ ) {
                    if(email_list[i].charAt(k)=='.'){
                        need3=k;
                        s4=true;
                    }
                }
                if(s1 && s2 && s4){
                    count++;
                }
                // to check 
//                 System.out.println(s1+""+i);
//                  System.out.println(s2+""+i);
//                   System.out.println(s4+""+i);
                }
        System.out.println(count);
            }
        }