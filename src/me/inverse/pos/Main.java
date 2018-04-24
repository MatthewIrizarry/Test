package me.inverse.pos;

/**
 * This POS will do basic things such as obtaining items from a list based on UPC code,
 * look up returns from independent transaction data files and generate on on screen receipt
 * from the data given in the files.
 * 
 * The UI will be constantly reset to a normal state: POSState.STANDBY
 * 
 * The standby screen will have two buttons as well as an input for a UPC code
 * 
 * #  					{RECEIPT LOOKUP}
 * # {UPC ENTRY}
 * #						{MANAGE INVENTORY}
 * 
 * During transactions, the POSState.IN_TRANSACTION
 * 
 * #						{CHANGE PRICE}
 * # {ITEM LIST}			{QUANTITY}
 * #						{TAXABLE}
 * 
 * During payment, the POSState.PROCESSING_PAYMENT
 * 
 * #						{CASH}
 * #	 {AMOUNT}			{CARD}
 * #						{GIFT CARD}
 * 
 * During farewell, the POSState.TRANSACTION_COMPLETED
 * 
 * #
 * #	 {THANK CUSTOMER}
 * #	
 * 
 * During managing inventory, the POSState.MANAGE_INV
 * 
 * # 					{ADD ITEM}
 * # {UPC ENTRY}			{REMOVE ITEM}
 * #						{LOOKUP ITEM}
 * 
 * During managing item data, the POSState.MANAGE_ITEM
 * 
 * # 					{CHANGE PRICE}
 * # {PRODUCT NAME T/N}			
 * #						{CHANGE TAX}
 * 
 * @author inverse
 *
 */



public class Main {
	
	

}
