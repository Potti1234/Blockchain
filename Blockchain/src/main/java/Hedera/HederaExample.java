package Hedera;

import com.hedera.hashgraph.sdk.AccountId;
import com.hedera.hashgraph.sdk.Client;
import com.hedera.hashgraph.sdk.PrivateKey;
import io.github.cdimascio.dotenv.Dotenv;
import com.hedera.hashgraph.sdk.HederaPreCheckStatusException;
import com.hedera.hashgraph.sdk.HederaReceiptStatusException;
import com.hedera.hashgraph.sdk.TransactionResponse;
import com.hedera.hashgraph.sdk.TransferTransaction;
import com.hedera.hashgraph.sdk.PublicKey;
import com.hedera.hashgraph.sdk.AccountCreateTransaction;
import com.hedera.hashgraph.sdk.Hbar;
import com.hedera.hashgraph.sdk.AccountBalanceQuery;
import com.hedera.hashgraph.sdk.AccountBalance;
import java.util.concurrent.TimeoutException;

public class HederaExample {

        public static void main(String[] args) {
                
                //Grab your Hedera Testnet account ID and private key
                AccountId myAccountId = AccountId.fromString(Dotenv.load().get("MY_ACCOUNT_ID"));
                PrivateKey myPrivateKey = PrivateKey.fromString(Dotenv.load().get("MY_PRIVATE_KEY"));
                //Create your Hedera Testnet client
        
                Client client = Client.forTestnet();
                client.setOperator(myAccountId, myPrivateKey);
        
                // Set default max transaction fee & max query payment
                client.setDefaultMaxTransactionFee(new Hbar(100)); 
                client.setMaxQueryPayment(new Hbar(50)); 
    }
}