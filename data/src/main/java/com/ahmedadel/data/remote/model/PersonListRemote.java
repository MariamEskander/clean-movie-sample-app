package com.ahmedadel.data.remote.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PersonListRemote {

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("results")
	private List<PersonRemote> persons;

	@SerializedName("total_results")
	private int totalResults;

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setPersons(List<PersonRemote> persons){
		this.persons = persons;
	}

	public List<PersonRemote> getPersons(){
		return persons;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	@SuppressWarnings("NullableProblems")
	@Override
 	public String toString(){
		return 
			"PersonListRemote{" +
			"page = '" + page + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",persons = '" + persons + '\'' +
			",total_results = '" + totalResults + '\'' + 
			"}";
		}
}