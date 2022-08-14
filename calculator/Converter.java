package calculator;

class Converter {

    public static int convertToNum (String number){
        int result;
        try{
            result = Integer.parseInt(number);
        }
        catch(NumberFormatException e){
            RomanNumbers num = RomanNumbers.valueOf(number);
            result = num.getNumber();
        }
        return result;
    }

    public static String convertToRom(int num) throws Exception{
        String result;

        if(num > 0 && num < 11){
            result = RomanNumbers.getRoman(num);
        }
        else if(num > 11 & num < 101){
            result = RomanNumbers.getRoman(num - num % 10) + RomanNumbers.getRoman(num % 10);
        }
        else if(num < 0) {
            throw new Exception("В римской системе нет отрицательных чисел");
        }
        else throw new Exception("Слишком большое число");
        return result;
    }
}
