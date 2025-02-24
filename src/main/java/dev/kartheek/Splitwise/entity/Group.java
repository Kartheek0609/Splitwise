package dev.kartheek.Splitwise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name="SplitWise_Group")
public class Group extends BaseModel{
    private String name;
    @ManyToOne
    private User createdBy;
    private LocalDateTime creationDate;
    private double totalAmountSpent;
    @ManyToMany
    private List<User> members;
    @OneToMany
    private List<Expense> expenses;
    @OneToMany
    private List<SettlementTransaction> settlementTransactions;
}
