package com.example.ui_practice.ui.screens.transaction_details


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui_practice.R
import com.example.ui_practice.Transaction
import com.example.ui_practice.ui.screens.transaction_details.components.ChipRow
import com.example.ui_practice.ui.screens.transaction_details.components.Details
import com.example.ui_practice.ui.screens.transaction_details.components.Map
import com.example.ui_practice.ui.screens.transaction_details.components.Title
import com.example.ui_practice.ui.screens.transaction_list.components.transaction
import com.example.ui_practice.ui.theme.Grey100
import com.example.ui_practice.ui.theme.UipracticeTheme
import com.example.ui_practice.ui.theme.White800
import kotlinx.datetime.LocalDate


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransactionDetailsScreenRoot(
    transaction: Transaction,
    onDismiss: () -> Unit,
) {

    val modalBottomSheetState = rememberModalBottomSheetState()





    TransactionDetailsScreen(
        transaction = transaction,
        onDismiss = onDismiss,
        modalBottomSheetState = modalBottomSheetState,
        modifier = Modifier.padding(top = 24.dp),
    )


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TransactionDetailsScreen(
    transaction: Transaction?,
    onDismiss: () -> Unit,
    modalBottomSheetState: SheetState,
    modifier: Modifier = Modifier
) {

    if (transaction != null) {

        val date: LocalDate = LocalDate.parse(transaction.date)


        val formattedDate = "${date.dayOfWeek}, ${date.month} ${date.dayOfMonth}, ${date.year}".toString()


        ModalBottomSheet(
            onDismissRequest = onDismiss,
            sheetState = modalBottomSheetState,
            dragHandle = {}
        ) {


            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier.padding(horizontal = 16.dp)
            ) {
                IconButton(
                    onClick = onDismiss,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .clip(RoundedCornerShape(100.dp))
                        .background(White800)
                        .size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = stringResource(R.string.close),
                        modifier = Modifier.size(16.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    Title(
                        title = transaction.brand,
                        description = transaction.description
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = transaction.amount,
                        style = MaterialTheme.typography.displaySmall,
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = formattedDate,
                        style = MaterialTheme.typography.bodySmall,
                        color = Grey100
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    ChipRow()
                    Spacer(modifier = Modifier.height(24.dp))

                    Details(
                        transactionNumber = transaction.transactionNumber,
                        transactionType = transaction.transactionType,
                        status = transaction.status,
                        cardNumber = transaction.cardNumber,
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Map(
                        location = transaction.location
                    )

                }

            }
        }
    } else {
        Text(
            text = "Sorry there's an issue. Please try again",
            style = MaterialTheme.typography.bodySmall,
            color = Grey100
        )
    }


}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TransactionListScreenPreview() {
    UipracticeTheme {
        TransactionDetailsScreen(
            transaction = transaction,
            onDismiss = {},
            modalBottomSheetState = rememberStandardBottomSheetState(
                initialValue = SheetValue.Expanded),
            modifier = Modifier,
        )
    }
}

