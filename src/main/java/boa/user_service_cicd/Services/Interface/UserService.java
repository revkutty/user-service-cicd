package boa.user_service_cicd.Services.Interface;

import boa.user_service_cicd.Models.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Users createUser(Users user);
    List<Users> getAllUsers();

    Optional<Users> getUserById(Long userId);

    Optional<Users> updateUser(Long id, Users updatedUser);

    boolean deleteUser(Long id);

    Users updateKycStatus(Long userId, String kycStatus);


  //  Optional<Double> getAccountBalance(String accountNumber);

  //  Optional<Double> getAccountBalanceByAccountId(Long accountId);
}
