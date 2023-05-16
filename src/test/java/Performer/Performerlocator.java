package Performer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Performerlocator {
	private static WebElement uName=null;
	private static WebElement pass=null;
	private static WebElement submit=null;
	private static WebElement sequrity=null;
	private static WebElement question1=null;
	private static WebElement question2=null;
	private static WebElement btnvalidate=null;
	private static WebElement ars=null;
	private static WebElement financialyear=null;
	private static WebElement selectfinancialyear=null;
	private static WebElement opencount=null;
	private static WebElement company=null;
	private static WebElement selectcompany=null;
	private static WebElement subunit=null;
	private static WebElement selectsubunit=null;
	private static WebElement viewauditdetails=null;
	private static WebElement process=null;
	private static WebElement selectprocess=null;
	private static WebElement removeobservation=null;
	private static WebElement backbtn=null;
	private static WebElement notdone=null;
	private static WebElement addnew=null;
	private static WebElement auditstep=null;
	private static WebElement auditmethodology=null;
	private static WebElement saveaddnew=null;
	private static WebElement cross=null;
	private static WebElement messageaddnew=null;
	private static WebElement checkbox=null;
	private static WebElement checksave=null;
	private static WebElement messagesave=null;
	private static WebElement backbutton=null;
	private static WebElement newmail=null;
	private static WebElement newmail1=null;
	private static WebElement to=null;
	private static WebElement selectto=null;
	private static WebElement sendmail=null;
	private static WebElement cross1=null;
	private static WebElement bckbtn=null;
	private static WebElement internal=null;
	private static WebElement internalmail=null;
	private static WebElement to1=null;
	private static WebElement selectto1=null;
	private static WebElement sendmail1=null;
	private static WebElement cross2=null;
	private static WebElement viewdatarequest=null;
	private static WebElement auditee=null;
	private static WebElement selectauditee=null;
	private static WebElement reportingmanager=null;
	private static WebElement selectreportingmanager=null;
	private static WebElement saveviewdata=null;
	private static WebElement mydocument=null;
	private static WebElement mydocumentfilter=null;
	private static WebElement mydocumentselectfilter=null;
	private static WebElement mydocumentdownload=null;
	private static WebElement myreport=null;
	private static WebElement myreportfilter=null;
	private static WebElement myfinalreportdownload=null;
	private static WebElement myreportselectfilter=null;
	private static WebElement more=null;
	private static WebElement auditstatus=null;
	private static WebElement exportexcel=null;
	private static WebElement more1=null;
	private static WebElement openobservation=null;
	private static WebElement downloadopenobservation=null;
	private static WebElement more2=null;
	private static WebElement pastauditreport=null;
	private static WebElement pastauditexcelexport=null;
	private static WebElement downloadpast=null;
	private static WebElement more3=null;
	private static WebElement prerequsite=null;
	private static WebElement entity=null;
	private static WebElement selectentity=null;
	private static WebElement subentity=null;
	private static WebElement selectsubentity=null;
	private static WebElement year=null;
	private static WebElement selectyear=null;
	private static WebElement selectschedulingtype=null;
	private static WebElement schedulingtype=null;
	private static WebElement period=null;
	private static WebElement selectperiod=null;
	private static WebElement prerequsiteexcelexport=null;
	
	private static WebElement selectopenobservation=null;
	private static WebElement changestatus=null;
	private static WebElement next=null;
	private static WebElement frame=null;
	private static WebElement processwalkthrough=null;
	private static WebElement actualwdone=null;
	private static WebElement population=null;
	private static WebElement sample=null;
	private static WebElement remark=null;
	private static WebElement nextbtn=null;
	private static WebElement observationtitle=null;
	private static WebElement observation=null;
	private static WebElement briefobservation=null;
	private static WebElement observationbagr=null;
	private static WebElement AnnexureTitle=null;
	private static WebElement audiolink=null;
	private static WebElement businessrisk=null;
	private static WebElement rootcause=null;
	private static WebElement financialimpact=null;
	private static WebElement riskrating=null;
	private static WebElement selectriskrating=null;
	private static WebElement observationcategory=null;
	private static WebElement selectobservationcategory=null;
	private static WebElement recommendationtype=null;
	private static WebElement selectrecommendationtype=null;
	private static WebElement recommendation=null;
	private static WebElement managementresponse=null;
	private static WebElement personresponsible=null;
	private static WebElement selectpersonresponsible=null;
	private static WebElement ownername=null;
	private static WebElement selectownername=null;
	private static WebElement saverecommendation=null;
	private static WebElement recommendationok=null;
	private static WebElement saveobservation=null;
	private static WebElement observationok=null;
	private static WebElement historylog=null;
	private static WebElement reviewremark=null;
	private static WebElement submitbtn=null;
	private static WebElement exporttoexcel=null;
	private static WebElement draftobservation=null;
	private static WebElement draftexportexcel=null;
	private static WebElement ObservationList_Save=null;
	private static WebElement ObservationList_CheckBox=null;
	private static WebElement ObservationList_SaveMsg=null;
	public static WebElement setUname(WebDriver driver) {
		uName=driver.findElement(By.xpath("//*[@id='txtemail']"));
		return uName;
	}
	public static WebElement setPass(WebDriver driver) {
		pass=driver.findElement(By.xpath("//*[@id='txtpass']"));
		return pass;
	}
	
	public static WebElement clicksubmit(WebDriver driver) {
		submit=driver.findElement(By.xpath("//*[@id='Submit']"));
		return submit;
	}
	
	public static WebElement clicksequrity(WebDriver driver) {
		sequrity=driver.findElement(By.xpath("//*[@id='lnkSecurityQA']"));
		return sequrity;
	}
	
	public static WebElement setquestion1(WebDriver driver) {
		question1=driver.findElement(By.xpath("//*[@id=\"txtAnswer1\"]"));
		return question1;
	}
	public static WebElement setquestion2(WebDriver driver) {
		question2=driver.findElement(By.xpath("//*[@id='txtAnswar2']"));
		return question2;
	}
	public static WebElement clickbtnvalidate(WebDriver driver) {
		btnvalidate=driver.findElement(By.xpath("//*[@id='btnValidateQuestions']"));
		return btnvalidate;
	}
	public static WebElement clickars(WebDriver driver) {
		ars=driver.findElement(By.xpath("//*[@id='dvbtnAudit']/div[1]"));
		return ars;
	}
	public static WebElement clickfinancialyear(WebDriver driver) {
		financialyear=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a/span"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/a
		return financialyear;
	}
	public static WebElement clickselectfinancialyear(WebDriver driver) {
		selectfinancialyear=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlFinancialYear_chosen\']/div/ul/li[3]"));
		return selectfinancialyear;
	}
	public static WebElement clickopencount(WebDriver driver) {
		opencount=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_divOpenAuditCount\']"));
		return opencount;
	}
	public static WebElement clickcompany(WebDriver driver) {
		company=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/a"));
		//*[@id="ContentPlaceHolder1_ddlLegalEntity_chosen"]/a
		return company;
	}
	public static WebElement clickselectcompany(WebDriver driver) {
		selectcompany=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[3]"));
		return selectcompany;
	}
	/*public static WebElement clicksubunit(WebDriver driver) {
		subunit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlSubEntity1_chosen\']/a/span"));
		return subunit;
	}
	public static WebElement clickselectsubunit(WebDriver driver) {
		selectsubunit=driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_ddlSubEntity1_chosen\']/div/ul/li[4]"));
		return selectsubunit;
	}*/
	public static WebElement clickviewauditdetails(WebDriver driver) {
		viewauditdetails=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkAuditDetails_0']"));
		return viewauditdetails;
	}
	public static WebElement clickexporttoexcel(WebDriver driver) {
		exporttoexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return exporttoexcel;
	}
	public static WebElement clickdraftobservation(WebDriver driver) {
		draftobservation=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtObservationList']"));
		return draftobservation;
	}
	public static WebElement clickprocess(WebDriver driver) {
		process=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/a"));
		return process;
	}
	static WebElement clickselectprocess(WebDriver driver) {
		selectprocess=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlProcess_chosen']/div/ul/li[2]"));
		return selectprocess;
	}
	static WebElement clickdraftexportexcel(WebDriver driver) {
		draftexportexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblExport']"));
		return draftexportexcel;
	}
	
	public static WebElement ObservationList_CheckBox(WebDriver driver) {
		ObservationList_CheckBox=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_CheckBox1_0']"));
		return ObservationList_CheckBox;
	}
	public static WebElement ObservationList_Save(WebDriver driver) {
		ObservationList_Save=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSave']"));
		return ObservationList_Save;
	}
	public static WebElement ObservationList_SaveMsg(WebDriver driver) {
		ObservationList_SaveMsg=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ValidationSummary1']/ul/li"));
		return ObservationList_SaveMsg;
	}
	public static WebElement clickremoveobservation(WebDriver driver) {
		removeobservation=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdObservationList_lnkAuditDetails_0']/img"));
		return removeobservation;
	}
	public static WebElement clickbackbtn(WebDriver driver) {
		backbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return backbtn;
	}
	public static WebElement clicknotdone(WebDriver driver) {
		notdone=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdAuditStatus_lblRiskNotDone_1']"));
		return notdone;
	}
	public static WebElement clickaddnew(WebDriver driver) {
		addnew=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAddChecklist']"));
		return addnew;
	}
	public static WebElement clickauditstep(WebDriver driver) {
		auditstep=driver.findElement(By.xpath("//*[@id='txtATBD']"));
		return auditstep;
	}
	public static WebElement clickauditmethodology(WebDriver driver) {
		auditmethodology=driver.findElement(By.xpath("//*[@id='txtAuditObjective']"));
		return auditmethodology;
	}
	public static WebElement clicksaveaddnew(WebDriver driver) {
		saveaddnew=driver.findElement(By.xpath("//*[@id='btnPopupSave']"));
		return saveaddnew;
	}

public static WebElement clickcross(WebDriver driver) {
	cross=driver.findElement(By.xpath("//*[@id='divShowDialog']/div/div/div[1]/button"));
	return cross;
}
	public static WebElement clickmessageaddnew(WebDriver driver) {
		messageaddnew=driver.findElement(By.xpath("//*[@id='ValidationSummary3']/ul/li"));
		return messageaddnew;
	}
	public static WebElement clickcheckbox(WebDriver driver) {
		checkbox=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_CheckBox1_0']"));
		return checkbox;
	}
	public static WebElement clickchecksave(WebDriver driver) {
		checksave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnAllSavechk']"));
		return checksave;
	}
	//public static WebElement clickmessagesave(WebDriver driver) {
		//messagesave=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_CheckBox1_0']"));
		//return messagesave;
	//}
	public static WebElement clickbackbutton(WebDriver driver) {
		backbutton=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return backbutton;
	}
	public static WebElement clicknewmail(WebDriver driver) {
		newmail=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lnkClosingMeeting']"));
		return newmail;
	}
	public static WebElement clicknewmail1(WebDriver driver) {
		newmail1=driver.findElement(By.xpath("//*[@id='btnNewMail']"));
		return newmail1;
	}
	public static WebElement clickto(WebDriver driver) {
		to=driver.findElement(By.xpath("//*[@id='example']/div[2]/div/div"));
		return to;
	}
	public static WebElement clickselectto(WebDriver driver) {
		selectto=driver.findElement(By.xpath("//*[@id='email_listbox']/li[2]"));
		return selectto;
	}
	public static WebElement clicksendmail(WebDriver driver) {
		sendmail=driver.findElement(By.xpath("//*[@id='example']/div[7]/button"));
		//*[@id="example"]/div[7]/button
		return sendmail;
	}
	public static WebElement clickcross1(WebDriver driver) {
		cross1=driver.findElement(By.xpath("//*[@id='divPreShowDialog']/div/div/div[1]/button"));
		return cross1;
	}
	public static WebElement clickbckbtn(WebDriver driver) {
		bckbtn=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		return bckbtn;
	}
	public static WebElement clickinternal(WebDriver driver) {
		internal=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkClosingMeeting_0']/img"));
		return internal;
	}
	public static WebElement clickinternalmail(WebDriver driver) {
		internalmail=driver.findElement(By.xpath("//*[@id='btnNewMail']"));
		return internalmail;
	}
	public static WebElement clickto1(WebDriver driver) {
		to1=driver.findElement(By.xpath("//*[@id='example']/div[2]/div/div"));
		return to1;
	}
	public static WebElement clickselectto1(WebDriver driver) {
		selectto1=driver.findElement(By.xpath("//*[@id='email_listbox']/li[4]"));
		return selectto1;
	}
	public static WebElement clicksendmail1(WebDriver driver) {
		sendmail1=driver.findElement(By.xpath("//*[@id='example']/div[7]/button"));
		//*[@id="example"]/div[7]/button
		return sendmail1;
	}
	public static WebElement clickcross2(WebDriver driver) {
		cross2=driver.findElement(By.xpath("//*[@id='divPreShowDialog']/div/div/div[1]/button"));
		return cross2;
	}
	/*public static WebElement clickviewdatarequest(WebDriver driver) {
		viewdatarequest=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0']/img"));
		return viewdatarequest;
	}
	public static WebElement clickauditee(WebDriver driver) {
		auditee=driver.findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']/div/div/input]"));
		return auditee;
	}
	public static WebElement clickselectauditee(WebDriver driver) {
		selectauditee=driver.findElement(By.xpath("//*[@id='ddlPerformerFilter_chosen']/div/ul/li[8]"));
		return selectauditee;
	}
	public static WebElement clickreportingmanager(WebDriver driver) {
		reportingmanager=driver.findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']/div/div/input"));
		return reportingmanager;
	}
	public static WebElement clickselectreportingmanager(WebDriver driver) {
		selectreportingmanager=driver.findElement(By.xpath("//*[@id='ddlReviewerFilter_chosen']/div/ul/li[3]"));
		return selectreportingmanager;
	}
	public static WebElement clicksaveviewdata(WebDriver driver) {
		saveviewdata=driver.findElement(By.xpath("//*[@id='btnSave']"));
		return saveviewdata;
	}*/
	public static WebElement clickmydocument(WebDriver driver) {
		mydocument=driver.findElement(By.xpath("//*[@id='leftdocumentmenu']/a/span[1]"));
		return mydocument;
	}
	public static WebElement clickmydocumentfilter(WebDriver driver) {
		mydocumentfilter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']"));
		return mydocumentfilter;
	}
	public static WebElement clickmydocumentselectfilter(WebDriver driver) {
		mydocumentselectfilter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[2]"));
		//*[@id="ContentPlaceHolder1_ddlFinancialYear_chosen"]/div/ul/li[2]
		return mydocumentselectfilter;
	}
	public static WebElement clickmydocumentdownload(WebDriver driver) {
		mydocumentdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfile_0']"));
		return mydocumentdownload;
	}
	public static WebElement clickmyreport(WebDriver driver) {
		myreport=driver.findElement(By.xpath("//*[@id='leftreportsmenu']/a"));
		return myreport;
	}
	public static WebElement clickmyreportfilter(WebDriver driver) {
		myreportfilter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/a/span"));
		return myreportfilter;
	}
	public static WebElement clickmyreportselectfilter(WebDriver driver) {
		myreportselectfilter=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFinancialYear_chosen']/div/ul/li[2]"));
		return myreportselectfilter;
	}
	public static WebElement clickmyfinalreportdownload(WebDriver driver) {
		myfinalreportdownload=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_lblDocumentDownLoadfileActionAll_0']"));
		return myfinalreportdownload;
	}
	public static WebElement clickmore(WebDriver driver) {
		more=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more;
	}
	public static WebElement clickauditstatus(WebDriver driver) {
		auditstatus=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[3]/a"));
		return auditstatus;
	}
	public static WebElement clickexportexcel(WebDriver driver) {
		exportexcel=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnExportExcel']"));
		return exportexcel;
	}
	public static WebElement clickopenobservation(WebDriver driver) {
		openobservation=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[2]/a"));
		return openobservation;
	}
	public static WebElement clickmore1(WebDriver driver) {
		more1=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more1;
	}
	
	public static WebElement clickselectopenobservation(WebDriver driver) {
		selectopenobservation=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[1]/a/"));
		return selectopenobservation;
	}
	public static WebElement clickdownloadopenobservation(WebDriver driver) {
		downloadopenobservation=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return downloadopenobservation;
	}
	public static WebElement clickmore2(WebDriver driver) {
		more2=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more2;
	}
	public static WebElement clickpastauditreport(WebDriver driver) {
		pastauditreport=driver.findElement(By.xpath("//*[@id=\"rblRole1\"]/li[2]/div/ul/li[6]/a"));
		return pastauditreport;
	}
	public static WebElement clickpastauditexcelexport(WebDriver driver) {
		pastauditexcelexport=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdComplianceRoleMatrix_lblDownLoadfile_0']/img"));
		return pastauditexcelexport;
	}
	public static WebElement clickdownloadpast(WebDriver driver) {
		downloadpast=driver.findElement(By.xpath("//*[@id='grdVersionDisplayDownload_lblDownLoadfile_0']/img"));
		//*[@id="grdVersionDisplayDownload_lblDownLoadfile_0"]/img
		return downloadpast;
	}
	public static WebElement clickmore3(WebDriver driver) {
		more3=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/button"));
		return more3;
	}
	public static WebElement clickprerequsite(WebDriver driver) {
		prerequsite=driver.findElement(By.xpath("//*[@id='rblRole1']/li[2]/div/ul/li[4]/a"));
		return prerequsite;
	}
	public static WebElement clickentity(WebDriver driver) {
		entity=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlLegalEntity_chosen\"]/div/div/input"));
		return entity;
	}
	public static WebElement clickselectentity(WebDriver driver) {
		selectentity=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlLegalEntity_chosen']/div/ul/li[2]"));
		return selectentity;
	}
	public static WebElement clicksubentity(WebDriver driver) {
		subentity=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlSubEntity1_chosen\"]/div/div/input"));
		return subentity;
	}
	public static WebElement clickselectsubentity(WebDriver driver) {
		selectsubentity=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSubEntity1_chosen']/div/div/input"));
		return selectsubentity;
	}
	public static WebElement clickyear(WebDriver driver) {
		year=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/div/input"));
		return year;
	}
	public static WebElement clickselectyear(WebDriver driver) {
		selectyear=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlFilterFinancial_chosen']/div/ul/li[2]"));
		return selectyear;
	}
	
	public static WebElement clickschedulingtype(WebDriver driver) {
		schedulingtype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/a/span"));
		return schedulingtype;
	}
	public static WebElement clickselectschedulingtype(WebDriver driver) {
		selectschedulingtype=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlSchedulingType_chosen']/div/ul/li[2]"));
		return selectschedulingtype;
	}
	public static WebElement clickperiod(WebDriver driver) {
		period=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/a/span"));
		return period;
	}
	public static WebElement clickselectperiod(WebDriver driver) {
		selectperiod=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlPeriod_chosen']/div/ul/li[2]"));
		return selectperiod;
	}
	public static WebElement clickprerequsiteexcelexport(WebDriver driver) {
		prerequsiteexcelexport=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lbtnExportExcel']"));
		return prerequsiteexcelexport;
	}
	
	
	
	public static WebElement clickchangestatus(WebDriver driver) {
		changestatus=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_grdSummaryDetailsAuditCoverage_btnChangeStatus_0']/img"));
		return changestatus;
	}
	public static WebElement clickframe(WebDriver driver) {
		frame=driver.findElement(By.xpath("//*[@id='showdetails']"));
		return frame;
	}
	public static WebElement clicknext(WebDriver driver) {
		next=driver.findElement(By.xpath("//*[@id='btn1']"));
		return next;
	}
	public static WebElement clickprocesswalkthrough(WebDriver driver) {
		processwalkthrough=driver.findElement(By.xpath("//*[@id='txtWalkthrough']"));
		return processwalkthrough;
	}
	public static WebElement clickactualwdone(WebDriver driver) {
		actualwdone=driver.findElement(By.xpath("//*[@id='txtActualWorkDone']"));
		return actualwdone;
	}
	public static WebElement clickpopulation(WebDriver driver) {
		population=driver.findElement(By.xpath("//*[@id='txtpopulation']"));
		return population;
	}
	public static WebElement clicksample(WebDriver driver) {
		sample=driver.findElement(By.xpath("//*[@id='txtSample']"));
		return sample;
	}
	public static WebElement clickremark(WebDriver driver) {
		remark=driver.findElement(By.xpath("//*[@id='tbxRemarks']"));
		return remark;
	}
	public static WebElement clicknextbtn(WebDriver driver) {
		nextbtn=driver.findElement(By.xpath("//*[@id='btn2']"));
		return nextbtn;
	}
	public static WebElement clickobservationtitle(WebDriver driver) {
		observationtitle=driver.findElement(By.xpath("//*[@id='txtObservationTitle']"));
		return observationtitle;
	}
		public static WebElement clickobservation(WebDriver driver) {
			observation=driver.findElement(By.xpath("//*[@id='txtObservation']"));
			return observation;
		}
		public static WebElement clickbriefobservation(WebDriver driver) {
			briefobservation=driver.findElement(By.xpath("//*[@id='tbxBriefObservation']"));
			return briefobservation;
		}
		public static WebElement clickAnnexureTitle(WebDriver driver) {
			AnnexureTitle=driver.findElement(By.xpath("//*[@id='tbxObjBackground']"));
			return AnnexureTitle;
		}
		public static WebElement clickaudiolink(WebDriver driver) {
			audiolink=driver.findElement(By.xpath("//*[@id='txtMultilineVideolink']"));
			return audiolink;
		}
		public static WebElement clickbusinessrisk(WebDriver driver) {
			businessrisk=driver.findElement(By.xpath("//*[@id='txtRisk']"));
			return businessrisk;
		}
		public static WebElement clickrootcause(WebDriver driver) {
			rootcause=driver.findElement(By.xpath("//*[@id='txtRootcost']"));
			return rootcause;
		}
		public static WebElement clickfinancialimpact(WebDriver driver) {
			financialimpact=driver.findElement(By.xpath("//*[@id='txtfinancialImpact']"));
			return financialimpact;
		}
		public static WebElement clickriskrating(WebDriver driver) {
			riskrating=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[19]/span/span/span[1]"));
			return riskrating;
		}
		public static WebElement clickselectriskrating(WebDriver driver) {
			selectriskrating=driver.findElement(By.xpath("//*[@id='ddlobservationRating_listbox']/li[1]"));
			return selectriskrating;
		}
		public static WebElement clickobservationcategory(WebDriver driver) {
			observationcategory=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[20]/span/span/span[1]"));
			return observationcategory;
		}
		public static WebElement clickselectobservationcategory(WebDriver driver) {
			selectobservationcategory=driver.findElement(By.xpath("//*[@id='ddlObservationCategory_listbox']/li[5]"));
			return selectobservationcategory;
		}
		public static WebElement clickrecommendationtype(WebDriver driver) {
			recommendationtype=driver.findElement(By.xpath("//*[@id=\"tabstrip-3\"]/div[23]/fieldset/div[2]/div[1]/span/span/span[1]"));
			return recommendationtype;
		}
		public static WebElement clickselectrecommendationtype(WebDriver driver) {
			selectrecommendationtype=driver.findElement(By.xpath("//*[@id='ddlRecommType_listbox']/li[2]"));
			return selectrecommendationtype;
		}
		public static WebElement clickrecommendation(WebDriver driver) {
			recommendation=driver.findElement(By.xpath("//*[@id='txtRecommendation']"));
			return recommendation;
		}
		public static WebElement clickmanagementresponse(WebDriver driver) {
			managementresponse=driver.findElement(By.xpath("//*[@id='txtMgtResponse']"));
			return managementresponse;
		}
		public static WebElement clickpersonresponsible(WebDriver driver) {
			personresponsible=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[6]/span/span/span[1]"));
			return personresponsible;
		}
		public static WebElement clickselectpersonresponsible(WebDriver driver) {
			selectpersonresponsible=driver.findElement(By.xpath("//*[@id='ddlPersonresponsible_listbox']/li[29]"));
			//*[@id="ddlPersonresponsible_listbox"]/li[29]
			return selectpersonresponsible;
		}
		public static WebElement clickownername(WebDriver driver) {
			ownername=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[23]/fieldset/div[2]/div[7]/span/span/span[1]"));
			return ownername;
		}
		public static WebElement clickselectownername(WebDriver driver) {
			selectownername=driver.findElement(By.xpath("//*[@id='ddlOwnerName_listbox']/li[14]"));
			return selectownername;
		}
		public static WebElement clicksaverecommendation(WebDriver driver) {
			saverecommendation=driver.findElement(By.xpath("//*[@id='saveRecommendation']"));
			return saverecommendation;
		}
		public static WebElement clickrecommendationok(WebDriver driver) {
			recommendationok=driver.findElement(By.id("saveRecommendation"));
			return recommendationok;
			
		}
		public static WebElement clicksaveobservation(WebDriver driver) {
			saveobservation=driver.findElement(By.xpath("//*[@id='btn3']"));
			return saveobservation;
		}
		public static WebElement clickobservationok(WebDriver driver) {
			observationok=driver.findElement(By.xpath("(//*[@class='k-button k-primary'])[3]"));
			return observationok;
		}
		public static WebElement clickhistorylog(WebDriver driver) {
			historylog=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[25]/div[1]/a"));
			return historylog;
		}
		public static WebElement clickreviewremark(WebDriver driver) {
			reviewremark=driver.findElement(By.xpath("//*[@id='tabstrip-3']/div[25]/div[1]/a"));
			return reviewremark;
		}
		public static WebElement clicksubmitbtn(WebDriver driver) {
			submitbtn=driver.findElement(By.xpath("//*[@id='btnSave']"));
			return submitbtn;
		}
		public static WebElement clickDashboard(WebDriver driver)
		{
			submitbtn=driver.findElement(By.xpath("//*[@id='leftdashboardmenu']"));
			return submitbtn;
		}
		
		
			
}

