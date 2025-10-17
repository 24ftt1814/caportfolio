public class ProductRating {
    public static void main(String[] args) {
       
        int[][] rating = {
            {4, 5, 4}, 
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };

        String[] criteria = {"Product", "Package", "Delivery"};
        int customers = rating.length;
        int cols = rating[0].length;

        System.out.println("Rating\tProduct\tPackage\tDelivery");

    
        double[] avgCriterion = new double[cols];
        for (int j = 0; j < cols; j++) {
            double total = 0;
            for (int i = 0; i < customers; i++) {
                total += rating[i][j];
            }
            avgCriterion[j] = total / customers;
        }

        System.out.print("Average\t");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%.2f\t", avgCriterion[j]);
        }
        System.out.println();
        for (int i = 0; i < customers; i++) {
            double total = 0;
            for (int j = 0; j < cols; j++) {
                total += rating[i][j];
            }
            double avg = total / cols;
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), avg);
        }
    }
}
