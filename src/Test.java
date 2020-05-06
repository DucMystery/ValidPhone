public class Test {

    public static final String[] validPhone= new String[]{"84-0972522048","84-0911199191"};
    public static final String[] invalidPhone= new String[]{"84-097252204a","843-0911199191"};

    public static void main(String[] args) {

        RegexPhone regexPhone = new RegexPhone();
        for (String phone : validPhone){
            boolean isValid = regexPhone.valid(phone);
            System.out.println("Phone is "+phone+" is valid "+isValid);
        }

        for (String phone1 : invalidPhone){
            boolean isValid = regexPhone.valid(phone1);
            System.out.println("Phone is "+phone1+" is valid "+isValid);
        }
    }
}
