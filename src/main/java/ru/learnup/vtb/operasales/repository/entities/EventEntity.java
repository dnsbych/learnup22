package ru.learnup.vtb.operasales.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "events")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "events_seq")
    @SequenceGenerator(name = "events_seq", sequenceName = "events_seq")
    private Long id;

    public EventEntity(String name) {
        this.name = name;
    }

    public EventEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private Collection<TicketEntity> tickets;


    @Column(name = "name")
    private String name;


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(String.format("%s (%d)\n", name, id));

        for (TicketEntity ticket: tickets) {
            sb.append(ticket).append("\n");
        }

        return sb.toString();
    }
}
