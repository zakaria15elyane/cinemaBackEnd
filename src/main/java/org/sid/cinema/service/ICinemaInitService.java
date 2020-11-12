package org.sid.cinema.service;

import org.springframework.stereotype.Service;


public interface ICinemaInitService {

	public void initVilles();
	public void initCinemas();
	public void initSalles();
	public void initPlace();
	public void initSceance();
	public void initCategorie();
	public void initFilms();
	public void initProjections();
	public void initTickets();
}
