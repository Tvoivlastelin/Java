package seminar2;

        public class task {
            public static void main(String[] args) {
                //Дано четное число N (>0) и символы c1 и c2.
                //       Написать метод, который вернет строку длины N,
                //которая состоит из чередующихся символов c1 и c2, начиная с c1.

                int n = 4;

                String c1 = "A";
                String c2 = "Y";
                StringBuilder sb = new StringBuilder();



                for (int i = 0; i < n/2; i++){
                    sb.append(c1).append(c2);

                }
                System.out.println(sb);
            }
        }



//    public static StringBuilder buildString(int n,char c1,char c2){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            if(i % 2 ==0){
//                sb.append(c1).append(c2);
//            }
//            else {
//                sb.append(c2);
//            }
//        }
//        return sb;
//    }