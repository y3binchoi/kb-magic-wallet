package kb04.team02.web.mvc.domain.wallet.common;

import kb04.team02.web.mvc.domain.common.CurrencyCode;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@Getter
public abstract class ForeignCurrencyBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallet_foreign_balance_seq")
    @SequenceGenerator(name = "wallet_foreign_balance_seq", allocationSize = 1, sequenceName = "wallet_foreign_balance_seq")
    @Column(name = "wallet_foreign_balance_id")
    private Long foreignBalanceId;

    @Enumerated(EnumType.ORDINAL)
    private CurrencyCode currencyCode;

    private Long balance;
}
