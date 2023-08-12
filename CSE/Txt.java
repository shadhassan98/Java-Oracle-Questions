package CSE;

// class Txt {
//     public static void main(String[] args) {
//         boolean res = new LengthValidator() {
//             public boolean checkLength (String str) {
//                 return str.length() > 5 && str.length() < 10;
//             }
//         }.checkLength("Hello");
//         System.out.println(res);
//     }
// }

class Txt {
    public static void main(String[] args) {
        LengthValidator lvr = (str -> {return str.length() > 5 && str.length() < 10;});
        System.out.println(lvr.checkLength("Hello"));

    }
}
