package com.example.ui_practice.data

import com.example.ui_practice.Status
import com.example.ui_practice.Transaction
import com.example.ui_practice.TransactionDay
import com.example.ui_practice.TransactionType

val transactionData = listOf(
    TransactionDay(
        date = "2024-02-01",
        transactions = listOf(
            Transaction(
                amount = "-£45.50",
                brand = "Tesco",
                description = "Grocery Retail",
                location = "London, England",
                transactionNumber = "TXN-20240201-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-01"
            ),
            Transaction(
                amount = "-£4.80",
                brand = "Costa Coffee",
                description = "Coffee Purchase",
                location = "Manchester, England",
                transactionNumber = "TXN-20240201-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-01"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-02",
        transactions = listOf(
            Transaction(
                amount = "-£21.00",
                brand = "Amazon",
                description = "Online Retail",
                location = "Birmingham, England",
                transactionNumber = "TXN-20240202-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-02"
            ),
            Transaction(
                amount = "+£15.00",
                brand = "Online Marketplace",
                description = "Sale of Item",
                location = "Bristol, England",
                transactionNumber = "TXN-20240202-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-02"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-03",
        transactions = listOf(
            Transaction(
                amount = "-£18.50",
                brand = "Pizza Express",
                description = "Restaurant Dining",
                location = "Oxford, England",
                transactionNumber = "TXN-20240203-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-03"
            ),
            Transaction(
                amount = "-£2.80",
                brand = "Bus Fare",
                description = "Transportation",
                location = "Cambridge, England",
                transactionNumber = "TXN-20240203-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-03"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-04",
        transactions = listOf(
            Transaction(
                amount = "-£12.99",
                brand = "Netflix",
                description = "Entertainment Subscription",
                location = "York, England",
                transactionNumber = "TXN-20240204-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-04"
            ),
            Transaction(
                amount = "-£55.00",
                brand = "Asda",
                description = "Grocery Retail",
                location = "Leeds, England",
                transactionNumber = "TXN-20240204-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-04"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-05",
        transactions = listOf(
            Transaction(
                amount = "-£12.00",
                brand = "Sports Direct",
                description = "Sporting Goods",
                location = "Liverpool, England",
                transactionNumber = "TXN-20240205-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-05"
            ),
            Transaction(
                amount = "-£8.50",
                brand = "Greggs",
                description = "Bakery & Food",
                location = "Sheffield, England",
                transactionNumber = "xTXN-20240205-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-05"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-06",
        transactions = listOf(
            Transaction(
                amount = "+£2500.00",
                brand = "Employer",
                description = "Salary Deposit",
                location = "London, England",
                transactionNumber = "TXN-20240206-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.BANK_TRANSFER,
                date = "2024-02-06"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-07",
        transactions = listOf(
            Transaction(
                amount = "-£4.99",
                brand = "Poundland",
                description = "Discount Retail",
                location = "Nottingham, England",
                transactionNumber = "TXN-20240207-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-07"
            ),
            Transaction(
                amount = "-£50.00",
                brand = "eBay",
                description = "Online Marketplace",
                location = "Leicester, England",
                transactionNumber = "TXN-20240207-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-07"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-08",
        transactions = listOf(
            Transaction(
                amount = "-£15.00",
                brand = "Subway",
                description = "Sandwich Retail",
                location = "Newcastle, England",
                transactionNumber = "TXN-20240208-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-08"
            ),
            Transaction(
                amount = "-£6.20",
                brand = "Co-op",
                description = "Convenience Store",
                location = "Southampton, England",
                transactionNumber = "TXN-20240208-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-08"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-09",
        transactions = listOf(
            Transaction(
                amount = "-£20.00",
                brand = "Sports Direct",
                description = "Sports Retail",
                location = "Bath, England",
                transactionNumber = "TXN-20240209-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-09"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-10",
        transactions = listOf(
            Transaction(
                amount = "-£2.80",
                brand = "Newsagent",
                description = "Newspaper & Magazine",
                location = "Brighton, England",
                transactionNumber = "TXN-20240210-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-10"
            ),
            Transaction(
                amount = "-£12.00",
                brand = "Charity Website",
                description = "Online Donation",
                location = "Cardiff, England",
                transactionNumber = "TXN-20240210-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-10"
            ),
            Transaction(
                amount = "-£20.00",
                brand = "Cinema",
                description = "Entertainment Tickets",
                location = "Guildford, England",
                transactionNumber = "TXN-20240210-003",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-10"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-11",
        transactions = listOf(
            Transaction(
                amount = "-£32.00",
                brand = "Pub",
                description = "Sunday Lunch",
                location = "Coventry, England",
                transactionNumber = "TXN-20240211-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-11"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-12",
        transactions = listOf(
            Transaction(
                amount = "-£120.00",
                brand = "Currys PC World",
                description = "Electronics Retail",
                location = "Norwich, England",
                transactionNumber = "TXN-20240212-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-12"
            ),
            Transaction(
                amount = "-£8.50",
                brand = "Boots",
                description = "Health & Beauty Retail",
                location = "London, England",
                transactionNumber = "TXN-20240212-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-12"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-13",
        transactions = listOf(
            Transaction(
                amount = "-£20.00",
                brand = "Cafe Nero",
                description = "Cafe Food & Drink",
                location = "Oxford, England",
                transactionNumber = "TXN-20240213-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-13"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-14",
        transactions = listOf(
            Transaction(
                amount = "-£70.00",
                brand = "Marks & Spencer",
                description = "Grocery Valentine's Shop",
                location = "Cambridge, England",
                transactionNumber = "TXN-20240214-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-14"
            ),
            Transaction(
                amount = "-£30.00",
                brand = "Indian Restaurant",
                description = "Restaurant Dining",
                location = "Bristol, England",
                transactionNumber = "TXN-20240214-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-14"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-15",
        transactions = listOf(
            Transaction(
                amount = "-£4.80",
                brand = "Newsagent",
                description = "Magazine Purchase",
                location = "Sheffield, England",
                transactionNumber = "TXN-20240215-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-15"
            ),
            Transaction(
                amount = "-£90.00",
                brand = "Zara",
                description = "Clothing Retail",
                location = "Liverpool, England",
                transactionNumber = "TXN-20240215-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-15"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-16",
        transactions = listOf(
            Transaction(
                amount = "-£28.50",
                brand = "Next",
                description = "Clothing Retail",
                location = "London, England",
                transactionNumber = "TXN-20240216-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-16"
            ),
            Transaction(
                amount = "-£14.00",
                brand = "Fish & Chip Shop",
                description = "Takeaway Retail",
                location = "Manchester, England",
                transactionNumber = "TXN-20240216-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-16"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-17",
        transactions = listOf(
            Transaction(
                amount = "-£10.50",
                brand = "National Trust Cafe",
                description = "Cafe Retail",
                location = "Birmingham, England",
                transactionNumber = "TXN-20240217-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-17"
            ),
            Transaction(
                amount = "-£55.00",
                brand = "Petrol Station",
                description = "Fuel & Automotive",
                location = "Oxford, England",
                transactionNumber = "TXN-20240217-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-17"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-18",
        transactions = listOf(
            Transaction(
                amount = "-£1.00",
                brand = "Charity Collection",
                description = "Charitable Donation",
                location = "Cambridge, England",
                transactionNumber = "TXN-20240218-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-18"
            ),
            Transaction(
                amount = "-£100.00",
                brand = "John Lewis",
                description = "Home Retail",
                location = "York, England",
                transactionNumber = "TXN-20240218-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-18"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-19",
        transactions = listOf(
            Transaction(
                amount = "+£25.00",
                brand = "Online Gaming Site",
                description = "Winnings Payout",
                location = "Bristol, England",
                transactionNumber = "TXN-20240219-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.BANK_TRANSFER,
                date = "2024-02-19"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-20",
        transactions = listOf(
            Transaction(
                amount = "-£4.50",
                brand = "Coffee Shop",
                description = "Coffee Purchase",
                location = "Sheffield, England",
                transactionNumber = "TXN-20240220-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-20"
            ),
            Transaction(
                amount = "-£30.00",
                brand = "Italian Restaurant",
                description = "Restaurant Dining",
                location = "Liverpool, England",
                transactionNumber = "TXN-20240220-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-20"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-21",
        transactions = listOf(
            Transaction(
                amount = "-£1.20",
                brand = "Parking Meter",
                description = "Parking Fee",
                location = "London, England",
                transactionNumber = "TXN-20240221-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-21"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-22",
        transactions = listOf(
            Transaction(
                amount = "-£40.00",
                brand = "IKEA",
                description = "Home Furniture",
                location = "Manchester, England",
                transactionNumber = "TXN-20240222-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-22"
            ),
            Transaction(
                amount = "-£7.50",
                brand = "Coffee Shop",
                description = "Coffee Takeaway",
                location = "Birmingham, England",
                transactionNumber = "TXN-20240222-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-22"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-23",
        transactions = listOf(
            Transaction(
                amount = "-£100.00",
                brand = "House of Fraser",
                description = "Department Store",
                location = "Oxford, England",
                transactionNumber = "TXN-20240223-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-23"
            ),
            Transaction(
                amount = "-£3.20",
                brand = "Bakery",
                description = "Baked Goods",
                location = "Cambridge, England",
                transactionNumber = "TXN-20240223-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-23"
            ),
            Transaction(
                amount = "+£10.00",
                brand = "Friend Payment",
                description = "Refund for Dinner",
                location = "York, England",
                transactionNumber = "TXN-20240223-003",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.BANK_TRANSFER,
                date = "2024-02-23"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-24",
        transactions = listOf(
            Transaction(
                amount = "-£25.00",
                brand = "National Rail",
                description = "Train Travel",
                location = "Bristol, England",
                transactionNumber = "TXN-20240224-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-24"
            ),
            Transaction(
                amount = "-£22.50",
                brand = "Thai Restaurant",
                description = "Takeaway Retail",
                location = "Sheffield, England",
                transactionNumber = "TXN-20240224-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-24"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-25",
        transactions = listOf(
            Transaction(
                amount = "-£5.50",
                brand = "Sainsbury's Local",
                description = "Convenience Grocery",
                location = "Liverpool, England",
                transactionNumber = "TXN-20240225-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-25"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-26",
        transactions = listOf(
            Transaction(
                amount = "-£10.00",
                brand = "Barbers",
                description = "Grooming Service",
                location = "London, England",
                transactionNumber = "TXN-20240226-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-26"
            ),
            Transaction(
                amount = "-£2.50",
                brand = "Vape Shop",
                description = "Retail Purchase",
                location = "Manchester, England",
                transactionNumber = "TXN-20240226-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-26"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-27",
        transactions = listOf(
            Transaction(
                amount = "-£200.00",
                brand = "Council Tax",
                description = "Government Bill",
                location = "Birmingham, England",
                transactionNumber = "TXN-20240227-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-27"
            ),
            Transaction(
                amount = "-£6.80",
                brand = "Sandwich Shop",
                description = "Food Retail",
                location = "Oxford, England",
                transactionNumber = "TXN-20240227-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-27"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-28",
        transactions = listOf(
            Transaction(
                amount = "-£14.00",
                brand = "Chemist Warehouse",
                description = "Medication Purchase",
                location = "Cambridge, England",
                transactionNumber = "TXN-20240228-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-28"
            ),
            Transaction(
                amount = "-£9.99",
                brand = "Spotify",
                description = "Subscription Renewal",
                location = "York, England",
                transactionNumber = "TXN-20240228-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-28"
            ),
            Transaction(
                amount = "-£3.80",
                brand = "Coffee Vendor",
                description = "Coffee Retail",
                location = "Bristol, England",
                transactionNumber = "TXN-20240228-003",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-28"
            ),
            Transaction(
                amount = "-£850.00",
                brand = "Rent Payment",
                description = "Accommodation Bill",
                location = "Sheffield, England",
                transactionNumber = "TXN-20240228-004",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-28"
            ),
            Transaction(
                amount = "-£10.00",
                brand = "Launderette",
                description = "Laundry Service",
                location = "Liverpool, England",
                transactionNumber = "TXN-20240228-005",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-28"
            )
        )
    ),
    TransactionDay(
        date = "2024-02-29",
        transactions = listOf(
            Transaction(
                amount = "-£200.00",
                brand = "Council Tax",
                description = "Government Bill",
                location = "London, England",
                transactionNumber = "TXN-20240229-001",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "3758-XXXX-XXXX-5678",
                date = "2024-02-29"
            ),
            Transaction(
                amount = "-£8.00",
                brand = "Sandwich Shop",
                description = "Food Retail",
                location = "Manchester, England",
                transactionNumber = "TXN-20240229-002",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-29"
            ),
            Transaction(
                amount = "-£12.00",
                brand = "Chemist",
                description = "Pharmacy Retail",
                location = "Birmingham, England",
                transactionNumber = "TXN-20240229-003",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "5299-XXXX-XXXX-1234",
                date = "2024-02-29"
            ),
            Transaction(
                amount = "-£2.50",
                brand = "Coffee Vendor",
                description = "Coffee Retail",
                location = "Oxford, England",
                transactionNumber = "TXN-20240229-004",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CASH,
                date = "2024-02-29"
            ),
            Transaction(
                amount = "-£950.00",
                brand = "Rent Payment",
                description = "Accommodation Bill",
                location = "Bristol, England",
                transactionNumber = "TXN-20240229-005",
                status = Status.SUCCESSFUL,
                transactionType = TransactionType.CARD,
                cardNumber = "4876-XXXX-XXXX-9012",
                date = "2024-02-29"
            )
        )
    ),
)