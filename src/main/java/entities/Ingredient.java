/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marcus
 */
@Entity
public class Ingredient {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private long id;

        @Column(name = "ingredient")
        private List<String> ingredients;

        @ManyToOne 
        private Recipe recipe;

}
