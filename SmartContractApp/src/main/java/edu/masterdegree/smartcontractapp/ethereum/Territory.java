package edu.masterdegree.smartcontractapp.ethereum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.4.0.
 */
public class Territory extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516104413803806104418339810160405280805160018054600160a060020a03191633600160a060020a03161790559190910190506000818051610059929160200190610060565b50506100fb565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a157805160ff19168380011785556100ce565b828001600101855582156100ce579182015b828111156100ce5782518255916020019190600101906100b3565b506100da9291506100de565b5090565b6100f891905b808211156100da57600081556001016100e4565b90565b6103378061010a6000396000f3006060604052600436106100565763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630d8b15df811461005b578063299a7bcc146100e5578063893d20e814610119575b600080fd5b341561006657600080fd5b61006e610155565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156100aa578082015183820152602001610092565b50505050905090810190601f1680156100d75780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156100f057600080fd5b61011773ffffffffffffffffffffffffffffffffffffffff600435811690602435166101fd565b005b341561012457600080fd5b61012c6102dd565b60405173ffffffffffffffffffffffffffffffffffffffff909116815260200160405180910390f35b61015d6102f9565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156101f35780601f106101c8576101008083540402835291602001916101f3565b820191906000526020600020905b8154815290600101906020018083116101d657829003601f168201915b5050505050905090565b60015473ffffffffffffffffffffffffffffffffffffffff90811690821663442890d56040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561026757600080fd5b5af1151561027457600080fd5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff161415156102a057600080fd5b506001805473ffffffffffffffffffffffffffffffffffffffff191673ffffffffffffffffffffffffffffffffffffffff92909216919091179055565b60015473ffffffffffffffffffffffffffffffffffffffff1690565b602060405190810160405260008152905600a165627a7a723058203f694c1909ac8b926686f6dbd50a7ecd785e68987e0744231e326b49772539d20029";

    public static final String FUNC_GETTERRITORYID = "getTerritoryID";

    public static final String FUNC_SETOWNER = "setOwner";

    public static final String FUNC_GETOWNER = "getOwner";

    protected Territory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Territory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getTerritoryID() {
        final Function function = new Function(FUNC_GETTERRITORYID,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setOwner(String _new_owner, String _contractForSell) {
        final Function function = new Function(
                FUNC_SETOWNER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_new_owner),
                        new org.web3j.abi.datatypes.Address(_contractForSell)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getOwner() {
        final Function function = new Function(FUNC_GETOWNER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Territory> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _territoryID) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_territoryID)));
        return deployRemoteCall(Territory.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Territory> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _territoryID) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_territoryID)));
        return deployRemoteCall(Territory.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Territory load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Territory(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Territory load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Territory(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
