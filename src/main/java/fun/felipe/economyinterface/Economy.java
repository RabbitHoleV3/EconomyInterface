package fun.felipe.economyinterface;

import fun.felipe.economyinterface.entities.EconomyResponse;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Economy definition
 */
public interface Economy {

    /**
     * Get name of Economy.
     *
     * @return name of Economy implemented.
     */
    public String getName();

    /**
     * Get name of Currency.
     *
     * @return name of Currency.
     */
    public String getCurrencyName();

    /**
     * Get name of Currency in plural.
     *
     * @return name of Currency in plural.
     */
    public String getCurrencyPluralName();

    /**
     * Get Symbol of Currency.
     *
     * @return symbol of Currency
     */
    public String getCurrencySymbol();

    /**
     * Get default Balance.
     *
     * @return default Balance.
     */
    public double getDefaultBalance();

    /**
     * Format amount into a human readable String.
     *
     * @param amount to format.
     * @return Human readable String describing amount.
     */
    public String formatBalance(double amount);

    /**
     * Checks if Player has an Account in Economy System.
     *
     * @param player {@link Player} to check.
     * @return if player has an Account.
     */
    public boolean hasAccount(Player player);

    /**
     * Checks if Player has an Account in Economy System.
     *
     * @param player {@link OfflinePlayer} to check.
     * @return if player has an Account.
     */
    public boolean hasAccount(OfflinePlayer player);

    /**
     * Checks if Player has an Account in Economy System.
     *
     * @param playerName to check.
     * @return if player has an Account.
     */
    public boolean hasAccount(String playerName);

    /**
     * Checks if Player has an Account in Economy System.
     *
     * @param uuid to check.
     * @return if player has an Account.
     */
    public boolean hasAccount(UUID uuid);

    /**
     * Create a Player Account in Economy System.
     *
     * @apiNote is recommended to check if the Player has an account before trying to create.
     *
     * @param player {@link Player} to create Account.
     * @return if account was created.
     */
    public boolean createAccount(Player player);

    /**
     *  Create a Player Account in Economy System.
     *
     *  @apiNote is recommended to check if the Player has an account before trying to create.
     *
     * @param player {@link OfflinePlayer} to create Account.
     * @return if account was created.
     */
    public boolean createAccount(OfflinePlayer player);

    /**
     *  Create a Player Account in Economy System.
     *
     *  @apiNote is recommended to check if the Player has an account before trying to create.
     *
     * @param playerName to create Account.
     * @return if account was created.
     */
    public boolean createAccount(String playerName);

    /**
     *  Create a Player Account in Economy System.
     *
     *  @apiNote is recommended to check if the Player has an account before trying to create.
     *
     * @param uuid to create Account.
     * @return if account was created.
     */
    public boolean createAccount(UUID uuid);

    /**
     * Get Balance of Player Account in Economy System.
     *
     * @apiNote is recommended to check if the Player has an account before get the Balance.
     *
     * @param player {@link Player} to get Balance.
     * @return Balance of Player.
     */
    public double getBalance(Player player);

    /**
     * Get Balance of Player Account in Economy System.
     *
     * @apiNote is recommended to check if the Player has an account before get the Balance.
     *
     * @param player {@link OfflinePlayer} to get Balance.
     * @return Balance of Player.
     */
    public double getBalance(OfflinePlayer player);

    /**
     * Get Balance of Player Account in Economy System.
     *
     * @apiNote is recommended to check if the Player has an account before get the Balance.
     *
     * @param playerName to get Balance.
     * @return Balance of Player.
     */
    public double getBalance(String playerName);

    /**
     * Get Balance of Player Account in Economy System.
     *
     * @apiNote is recommended to check if the Player has an account before get the Balance.
     *
     * @param uuid to get Balance.
     * @return Balance of Player.
     */
    public double getBalance(UUID uuid);

    /**
     * Check if Player has Balance.
     *
     * @apiNote is recommended to check if Player has an account before checking the Balance.
     *
     * @param player {@link Player} to check.
     * @param amount to check for.
     * @return true if {@link Player} has <b>Amount</b>, false if not.
     */
    public boolean hasBalance(Player player, double amount);

    /**
     * Check if Player has Balance.
     *
     * @apiNote is recommended to check if Player has an account before checking the Balance.
     *
     * @param player {@link OfflinePlayer} to check.
     * @param amount to check for.
     * @return true if {@link OfflinePlayer} has <b>Amount</b>, false if not.
     */
    public boolean hasBalance(OfflinePlayer player, double amount);

    /**
     * Check if Player has Balance.
     *
     * @apiNote is recommended to check if Player has an account before checking the Balance.
     *
     * @param playerName to check.
     * @param amount to check for.
     * @return true if Player has <b>Amount</b>, false if not.
     */
    public boolean hasBalance(String playerName, double amount);

    /**
     * Check if Player has Balance.
     *
     * @apiNote is recommended to check if Player has an account before checking the Balance.
     *
     * @param uuid to check.
     * @param amount to check for.
     * @return true if Player has <b>Amount</b>, false if not.
     */
    public boolean hasBalance(UUID uuid, double amount);

    /**
     * Withdraw an Amount from Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     * @implNote is recommended to check if Player has balance before withdrawing.
     *
     * @param player {@link Player} to withdraw from.
     * @param amount to withdraw.
     * @return details of Transaction.
     */
    public EconomyResponse withdrawPlayer(Player player, double amount);

    /**
     * Withdraw an Amount from Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     * @implNote is recommended to check if Player has balance before withdrawing.
     *
     * @param player {@link OfflinePlayer} to withdraw from.
     * @param amount to withdraw.
     * @return details of Transaction.
     */
    public EconomyResponse withdrawPlayer(OfflinePlayer player, double amount);

    /**
     * Withdraw an Amount from Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     * @implNote is recommended to check if Player has balance before withdrawing.
     *
     * @param playerName to withdraw from.
     * @param amount to withdraw.
     * @return details of Transaction.
     */
    public EconomyResponse withdrawPlayer(String playerName, double amount);

    /**
     * Withdraw an Amount from Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     * @implNote is recommended to check if Player has balance before withdrawing.
     *
     * @param uuid to withdraw from.
     * @param amount to withdraw.
     * @return details of Transaction.
     */
    public EconomyResponse withdrawPlayer(UUID uuid, double amount);

    /**
     * Deposit an Amount to Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     *
     * @param player {@link Player} to deposit to.
     * @param amount to deposit.
     * @return details of Transaction.
     */
    public EconomyResponse depositPlayer(Player player, double amount);

    /**
     * Deposit an Amount to Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     *
     * @param player {@link OfflinePlayer} to deposit to.
     * @param amount to deposit.
     * @return details of Transaction.
     */
    public EconomyResponse depositPlayer(OfflinePlayer player, double amount);

    /**
     * Deposit an Amount to Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     *
     * @param playerName to deposit to.
     * @param amount to deposit.
     * @return details of Transaction.
     */
    public EconomyResponse depositPlayer(String playerName, double amount);

    /**
     * Deposit an Amount to Player.
     *
     * @apiNote is recommended to check if Player has an account before withdrawing.
     *
     * @param uuid to deposit to.
     * @param amount to deposit.
     * @return details of Transaction.
     */
    public EconomyResponse depositPlayer(UUID uuid, double amount);
}
