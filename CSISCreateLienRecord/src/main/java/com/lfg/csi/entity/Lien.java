package com.lfg.csi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Lien {

	public String work_instance_id;
	public String work_type;
	public String payee_name;
	public String first_name;
	public String last_name;
	public String ssn;
	public String contract_number;
	public String payee_address_1;
	public String payee_address_2;
	public String city;
	public String state;
	public String zip;
	public String contract_certificate_number;
	public BigDecimal amount_paid_lfg_client;
	public BigDecimal account_balance;
	public Date lien_recived_date;
	public Date payment_date;
	public BigDecimal lien_amount;
	public String lien_status;
	public String lien_frequency;
	public String lien_id;
	public String lfg_processer_handling_lien;
	public String claimant_attorney_name;
	public Date create_ts;
	public Date last_update_ts;
	
	public Lien( String work_instance_id,
			 String work_type,
			 String payee_name,
			 String first_name,
			 String last_name,
			 String ssn,
			 String contract_number,
			 String payee_address_1,
			 String payee_address_2,
			 String city,
			 String state,
			 String zip,
			 String contract_certificate_number,
			 BigDecimal amount_paid_lfg_client,
			 BigDecimal account_balance,
			 Date lien_recived_date,
			 Date payment_date,
			 BigDecimal lien_amount,
			 String lien_status,
			 String lien_frequency,
			 String lien_id,
			 String lfg_processer_handling_lien,
			 String claimant_attorney_name,
			 Date create_ts,
			 Date last_update_ts) {
		this.work_instance_id=work_instance_id;
		this.work_type=work_type;
		this.payee_name=payee_name;
		this.first_name=first_name;
		this.last_name=last_name;
		this.ssn=ssn;
		this.contract_number=contract_number;
		this.payee_address_1=payee_address_1;
		this.payee_address_2=payee_address_2;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.contract_certificate_number=contract_certificate_number;
		this.amount_paid_lfg_client=amount_paid_lfg_client;
		this.account_balance=account_balance;
		this.lien_recived_date=lien_recived_date;
		this.payment_date=payment_date;
		this.lien_amount=lien_amount;
		this.lien_status=lien_status;
		this.lien_frequency=lien_frequency;
		this.lien_id=lien_id;
		this.lfg_processer_handling_lien=lfg_processer_handling_lien;
		this.claimant_attorney_name=claimant_attorney_name;
		this.create_ts=create_ts;
		this.last_update_ts=last_update_ts;

		
		
		
	}

	public String getWork_instance_id() {
		return work_instance_id;
	}

	public void setWork_instance_id(String work_instance_id) {
		this.work_instance_id = work_instance_id;
	}

	public String getWork_type() {
		return work_type;
	}

	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

	public String getPayee_name() {
		return payee_name;
	}

	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getContract_number() {
		return contract_number;
	}

	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}

	public String getPayee_address_1() {
		return payee_address_1;
	}

	public void setPayee_address_1(String payee_address_1) {
		this.payee_address_1 = payee_address_1;
	}

	public String getPayee_address_2() {
		return payee_address_2;
	}

	public void setPayee_address_2(String payee_address_2) {
		this.payee_address_2 = payee_address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getContract_certificate_number() {
		return contract_certificate_number;
	}

	public void setContract_certificate_number(String contract_certificate_number) {
		this.contract_certificate_number = contract_certificate_number;
	}

	public BigDecimal getAmount_paid_lfg_client() {
		return amount_paid_lfg_client;
	}

	public void setAmount_paid_lfg_client(BigDecimal amount_paid_lfg_client) {
		this.amount_paid_lfg_client = amount_paid_lfg_client;
	}

	public BigDecimal getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(BigDecimal account_balance) {
		this.account_balance = account_balance;
	}

	public Date getLien_recived_date() {
		return lien_recived_date;
	}

	public void setLien_recived_date(Date lien_recived_date) {
		this.lien_recived_date = lien_recived_date;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public BigDecimal getLien_amount() {
		return lien_amount;
	}

	public void setLien_amount(BigDecimal lien_amount) {
		this.lien_amount = lien_amount;
	}

	public String getLien_status() {
		return lien_status;
	}

	public void setLien_status(String lien_status) {
		this.lien_status = lien_status;
	}

	public String getLien_frequency() {
		return lien_frequency;
	}

	public void setLien_frequency(String lien_frequency) {
		this.lien_frequency = lien_frequency;
	}

	public String getLien_id() {
		return lien_id;
	}

	public void setLien_id(String lien_id) {
		this.lien_id = lien_id;
	}

	public String getLfg_processer_handling_lien() {
		return lfg_processer_handling_lien;
	}

	public void setLfg_processer_handling_lien(String lfg_processer_handling_lien) {
		this.lfg_processer_handling_lien = lfg_processer_handling_lien;
	}

	public String getClaimant_attorney_name() {
		return claimant_attorney_name;
	}

	public void setClaimant_attorney_name(String claimant_attorney_name) {
		this.claimant_attorney_name = claimant_attorney_name;
	}

	public Date getCreate_ts() {
		return create_ts;
	}

	public void setCreate_ts(Date create_ts) {
		this.create_ts = create_ts;
	}

	public Date getLast_update_ts() {
		return last_update_ts;
	}

	public void setLast_update_ts(Date last_update_ts) {
		this.last_update_ts = last_update_ts;
	}
}
