//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    public static final double INTEREST_RATE = 0.05;
    /**
     *
     */
    private double interestEarned;

    /**
     *  fsd.
     * @param name hi
     * @param accountCategory hello
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param setAccountNumber .
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /**
     *
     * @return
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param setAccountType .
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }

    /**
     *
     * @return
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param setAccountBalance .
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param setOwnerName .
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    /**
     *
     * @return
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param setInterestEarned .
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }
}
