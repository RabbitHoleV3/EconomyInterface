package fun.felipe.economyinterface.entities;

import fun.felipe.economyinterface.enums.ResponseType;

/**
 * Economy transaction response definition
 */
public class EconomyResponse {
    /**
     * Result of Transaction.
     */
    private final ResponseType type;
    /**
     * Amount modified.
     */
    private final double amount;
    /**
     * New balance of player account.
     */
    private final double balance;
    /**
     * Error message if 'type' is ResponseType.FAILURE
     */
    private String errorMessage;

    public EconomyResponse(ResponseType type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public EconomyResponse(ResponseType type, double amount, double balance, String errorMessage) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.errorMessage = errorMessage;
    }

    public ResponseType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean transactionSuccess() {
        return type == ResponseType.SUCCESS;
    }
}
