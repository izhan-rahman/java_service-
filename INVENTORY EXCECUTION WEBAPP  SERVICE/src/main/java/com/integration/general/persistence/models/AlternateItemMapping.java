package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##ALTERNATE_ITEM_MAPPING")
@Getter
@Setter
public class AlternateItemMapping {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="ITEM")
	private String item;
	@Column(name="ALTERNATE_ITEM_NAME")
	private String alternateItemName;
}