package tn.esprit.spring.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.Interfaces.AccountServices;
import tn.esprit.spring.entities.Account;


@RestController
public class AccountController {
	@Autowired
	AccountServices accountService;

	 @GetMapping("retrieve-account/{account-id}")
	    public Account retrieveAccount(@PathVariable("account-id") Long accountId) {
	    return accountService.retrieveAccount(accountId);
	    } 
	 
	 @PostMapping("/addAccount")
		public Account addAccount(@RequestBody Account account)
			{accountService.addAccount(account);
			return account;
			}
	 
	 @DeleteMapping("/deleteAccount/{account-id}")
		public void deleteaccount(@PathVariable("account-id")Long accountId){
		 accountService.deleteAccount(accountId);
	  
	 }		
	 
		@PutMapping("/PutAccount")
		public Account Updateaccount(@RequestBody Account account){
			Account acc=accountService.updateAccount(account);
			return acc;
		}
}
