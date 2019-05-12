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
import org.web3j.abi.datatypes.generated.Uint256;
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
public class SellTerritory extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516108f53803806108f583398101604052808051820191906020018051820191906020018051919060200180519190602001805191505033600160a060020a039081169084161461006157600080fd5b60058054600160a060020a031916600160a060020a0384811691909117918290551663893d20e86040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156100cf57600080fd5b5af115156100dc57600080fd5b5050506040518051600160a060020a0385811691161490506100fd57600080fd5b6000858051610110929160200190610175565b506001848051610124929160200190610175565b5060048054600160a060020a0319908116600160a060020a03948516179091556002805482169484169490941790935560038054909316339092169190911790915560065550506000600755610210565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106101b657805160ff19168380011785556101e3565b828001600101855582156101e3579182015b828111156101e35782518255916020019190600101906101c8565b506101ef9291506101f3565b5090565b61020d91905b808211156101ef57600081556001016101f9565b90565b6106d68061021f6000396000f3006060604052600436106100cc5763ffffffff60e060020a60003504166306fdde0381146100d157806308551a531461015b5780630d8b15df1461018a57806317d7de7c1461019d578063200d2ed2146101b0578063442890d5146101d55780634e69d560146101e85780635ca26249146101fb5780637284e4161461020e578063984bcad61461022157806398d5fdca14610234578063a035b1fe14610247578063a6f2ae3a1461025a578063c11ad0d314610264578063c7712b3814610277578063ce606ee01461028a575b600080fd5b34156100dc57600080fd5b6100e461029d565b60405160208082528190810183818151815260200191508051906020019080838360005b83811015610120578082015183820152602001610108565b50505050905090810190601f16801561014d5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561016657600080fd5b61016e61033b565b604051600160a060020a03909116815260200160405180910390f35b341561019557600080fd5b61016e61034a565b34156101a857600080fd5b6100e4610359565b34156101bb57600080fd5b6101c3610401565b60405190815260200160405180910390f35b34156101e057600080fd5b61016e610407565b34156101f357600080fd5b6101c3610416565b341561020657600080fd5b6100e461041c565b341561021957600080fd5b6100e461048f565b341561022c57600080fd5b61016e6104fa565b341561023f57600080fd5b6101c3610509565b341561025257600080fd5b6101c361050f565b610262610515565b005b341561026f57600080fd5b61016e61061d565b341561028257600080fd5b61016e61062c565b341561029557600080fd5b61016e610689565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103335780601f1061030857610100808354040283529160200191610333565b820191906000526020600020905b81548152906001019060200180831161031657829003601f168201915b505050505081565b600254600160a060020a031681565b600454600160a060020a031690565b610361610698565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103f75780601f106103cc576101008083540402835291602001916103f7565b820191906000526020600020905b8154815290600101906020018083116103da57829003601f168201915b5050505050905090565b60075481565b600354600160a060020a031690565b60075490565b610424610698565b60018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103f75780601f106103cc576101008083540402835291602001916103f7565b60018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103335780601f1061030857610100808354040283529160200191610333565b600454600160a060020a031681565b60065490565b60065481565b60035433600160a060020a039081169116141561053157600080fd5b6006546108fc013414151561054557600080fd5b6007541561055257600080fd5b6004546005805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392831617908190551663299a7bcc333060405160e060020a63ffffffff8516028152600160a060020a03928316600482015291166024820152604401600060405180830381600087803b15156105cd57600080fd5b5af115156105da57600080fd5b5050600160075550600254600654600160a060020a039091169080156108fc0290604051600060405180830381858888f19350505050151561061b57600080fd5b565b600554600160a060020a031681565b600554600090600160a060020a031663893d20e86040518163ffffffff1660e060020a028152600401602060405180830381600087803b151561066e57600080fd5b5af1151561067b57600080fd5b505050604051805191505090565b600354600160a060020a031681565b602060405190810160405260008152905600a165627a7a72305820417769fcf217dddbbcb6fa7a913d9a916751457843470961aecc03fa66164ae60029";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_SELLER = "seller";

    public static final String FUNC_GETTERRITORYID = "getTerritoryID";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_STATUS = "status";

    public static final String FUNC_GETCONTRACTOWNER = "getContractOwner";

    public static final String FUNC_GETSTATUS = "getStatus";

    public static final String FUNC_GETDESCTION = "getDesction";

    public static final String FUNC_DESCRIPTION = "description";

    public static final String FUNC_TERRITORYADRESSS = "territoryAdresss";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_PRICE = "price";

    public static final String FUNC_BUY = "buy";

    public static final String FUNC_TOSELLTERRITORY = "toSellTerritory";

    public static final String FUNC_GETOWNERFROMTERRITORY = "getOwnerFromTerritory";

    public static final String FUNC_CONTRACTOWNER = "contractOwner";

    protected SellTerritory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SellTerritory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> seller() {
        final Function function = new Function(FUNC_SELLER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getTerritoryID() {
        final Function function = new Function(FUNC_GETTERRITORYID,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> status() {
        final Function function = new Function(FUNC_STATUS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getContractOwner() {
        final Function function = new Function(FUNC_GETCONTRACTOWNER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getStatus() {
        final Function function = new Function(FUNC_GETSTATUS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getDesction() {
        final Function function = new Function(FUNC_GETDESCTION,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> description() {
        final Function function = new Function(FUNC_DESCRIPTION,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> territoryAdresss() {
        final Function function = new Function(FUNC_TERRITORYADRESSS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getPrice() {
        final Function function = new Function(FUNC_GETPRICE,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> price() {
        final Function function = new Function(FUNC_PRICE,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> buy(BigInteger weiValue) {
        final Function function = new Function(
                FUNC_BUY,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<String> toSellTerritory() {
        final Function function = new Function(FUNC_TOSELLTERRITORY,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getOwnerFromTerritory() {
        final Function function = new Function(FUNC_GETOWNERFROMTERRITORY,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> contractOwner() {
        final Function function = new Function(FUNC_CONTRACTOWNER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<SellTerritory> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _name, String _description, String _seller, String _territory, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description),
                new org.web3j.abi.datatypes.Address(_seller),
                new org.web3j.abi.datatypes.Address(_territory),
                new org.web3j.abi.datatypes.generated.Uint256(_price)));
        return deployRemoteCall(SellTerritory.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<SellTerritory> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _name, String _description, String _seller, String _territory, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description),
                new org.web3j.abi.datatypes.Address(_seller),
                new org.web3j.abi.datatypes.Address(_territory),
                new org.web3j.abi.datatypes.generated.Uint256(_price)));
        return deployRemoteCall(SellTerritory.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static SellTerritory load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SellTerritory(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static SellTerritory load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SellTerritory(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
