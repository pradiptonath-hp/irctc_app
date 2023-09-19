package com.ashokit.jpa.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookLand {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int bookId;
		private String bookName;
		private String bookCompany;
		private Double bookPrice;
		private String activeSw;
		
		@CreationTimestamp
		@Column(updatable=false)
		private LocalDateTime createDate;
		
		@UpdateTimestamp
		@Column(insertable=false)
		private LocalDateTime updateDate;
		public LocalDateTime getCreateDate() {
			return createDate;
		}
		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}
		public LocalDateTime getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(LocalDateTime updateDate) {
			this.updateDate = updateDate;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookCompany() {
			return bookCompany;
		}
		public void setBookCompany(String bookCompany) {
			this.bookCompany = bookCompany;
		}
		public Double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(Double bookPrice) {
			this.bookPrice = bookPrice;
		}
		public String getActiveSw() {
			return activeSw;
		}
		public void setActiveSw(String activeSw) {
			this.activeSw = activeSw;
		}
		
		@Override
		public String toString() {
			        return "BookLand [bookId=" + bookId + ", bookName=" + bookName + ", bookCompany=" + bookCompany
					+ ", bookPrice=" + bookPrice + ", activeSw=" + activeSw + ", createDate=" + createDate
					+ ", updateDate=" + updateDate + "]";
	}
}
