package cn.peter.ssm.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope(value = "prototype")
public class Leaverequest {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_id
	 *
	 * @mbg.generated
	 */
	private Integer l_id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_proposer
	 *
	 * @mbg.generated
	 */
	private String l_proposer;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_beginTime
	 *
	 * @mbg.generated
	 */
	private String l_beginTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_endTime
	 *
	 * @mbg.generated
	 */
	private String l_endTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_days
	 *
	 * @mbg.generated
	 */
	private Integer l_days;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_approve
	 *
	 * @mbg.generated
	 */
	private Integer l_approve;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_checker
	 *
	 * @mbg.generated
	 */
	private String l_checker;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column LEAVEREQUEST.l_reason
	 *
	 * @mbg.generated
	 */
	private String l_reason;

	public String getL_beginTime() {
		return l_beginTime;
	}

	public void setL_beginTime(String l_beginTime) {
		this.l_beginTime = l_beginTime;
	}

	public String getL_endTime() {
		return l_endTime;
	}

	public void setL_endTime(String l_endTime) {
		this.l_endTime = l_endTime;
	}

	public Integer getL_days() {
		return l_days;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column LEAVEREQUEST.l_id
	 *
	 * @return the value of LEAVEREQUEST.l_id
	 * @mbg.generated
	 */
	public Integer getL_id() {
		return l_id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_id
	 *
	 * @param l_id the value for LEAVEREQUEST.l_id
	 * @mbg.generated
	 */
	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column LEAVEREQUEST.l_proposer
	 *
	 * @return the value of LEAVEREQUEST.l_proposer
	 * @mbg.generated
	 */
	public String getL_proposer() {
		return l_proposer;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_proposer
	 *
	 * @param l_proposer the value for LEAVEREQUEST.l_proposer
	 * @mbg.generated
	 */
	public void setL_proposer(String l_proposer) {
		this.l_proposer = l_proposer == null ? null : l_proposer.trim();
	}


	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_days
	 *
	 * @param l_days the value for LEAVEREQUEST.l_days
	 * @mbg.generated
	 */
	public void setL_days(Integer l_days) {
		this.l_days = l_days;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column LEAVEREQUEST.l_approve
	 *
	 * @return the value of LEAVEREQUEST.l_approve
	 * @mbg.generated
	 */
	public Integer getL_approve() {
		return l_approve;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_approve
	 *
	 * @param l_approve the value for LEAVEREQUEST.l_approve
	 * @mbg.generated
	 */
	public void setL_approve(Integer l_approve) {
		this.l_approve = l_approve;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column LEAVEREQUEST.l_checker
	 *
	 * @return the value of LEAVEREQUEST.l_checker
	 * @mbg.generated
	 */
	public String getL_checker() {
		return l_checker;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_checker
	 *
	 * @param l_checker the value for LEAVEREQUEST.l_checker
	 * @mbg.generated
	 */
	public void setL_checker(String l_checker) {
		this.l_checker = l_checker == null ? null : l_checker.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column LEAVEREQUEST.l_reason
	 *
	 * @return the value of LEAVEREQUEST.l_reason
	 * @mbg.generated
	 */
	public String getL_reason() {
		return l_reason;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column LEAVEREQUEST.l_reason
	 *
	 * @param l_reason the value for LEAVEREQUEST.l_reason
	 * @mbg.generated
	 */
	public void setL_reason(String l_reason) {
		this.l_reason = l_reason == null ? null : l_reason.trim();
	}

	@Override
	public String toString() {
		return "Leaverequest{" +
				"l_id=" + l_id +
				", l_proposer='" + l_proposer + '\'' +
				", l_beginTime=" + l_beginTime +
				", l_endTime=" + l_endTime +
				", l_days=" + l_days +
				", l_approve=" + l_approve +
				", l_checker='" + l_checker + '\'' +
				", l_reason='" + l_reason + '\'' +
				'}';
	}
}