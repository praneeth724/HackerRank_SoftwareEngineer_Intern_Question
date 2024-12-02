class Result {

    /*
     * Complete the 'priceCheck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. FLOAT_ARRAY productPrices
     *  3. STRING_ARRAY productSold
     *  4. FLOAT_ARRAY soldPrice
     */

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Create a map to associate products with their correct prices
        Map<String, Float> priceMap = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            priceMap.put(products.get(i), productPrices.get(i));
        }

        // Count the errors in sold prices
        int errorCount = 0;
        for (int i = 0; i < productSold.size(); i++) {
            String soldProduct = productSold.get(i);
            Float actualPrice = soldPrice.get(i);
            if (!actualPrice.equals(priceMap.get(soldProduct))) {
                errorCount++;
            }
        }

        return errorCount;
    }
}
