public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, "2", 3, 4, 5};
        int sum = 0;
        int avg;
        try{
            for(var i : arr){
                if (i instanceof String){
                    sum+=Integer.parseInt((String) i);
                }else {
                    sum+= (Integer) i;
                }
            }
//           for(var i : arr){
//                sum+= (Integer) i;
//           }
            avg = sum / arr.length;
            System.out.println("Average - " + avg);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index: " + e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Invalid math: " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Not a number: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Some error: " + e.getMessage());
        }
    }
}