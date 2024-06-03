package com.horaceneto.Movie_Ticket.account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

}
