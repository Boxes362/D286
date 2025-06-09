public class Debt {
    private double debtRatio;

    // Private method to calculate debt ratio
    private void calculateDR(double totalDebt, double totalAssets)
    {
        if (totalAssets != 0)
        {
            debtRatio = totalDebt/totalAssets;
        }
        else
        {
            debtRatio = 0;
        }
    }


    // Public method to return the debt ratio
    public double getDR()
    {
        return debtRatio;
    }

    // Public method to set total debt and total assets, then calculate debt ratio
    public void setDR(double totalDebt, double totalAssets)
    {
        calculateDR(totalDebt, totalAssets);
    }
}