-- Create Database providerPortal;
USE providerportal;


 Drop Table UserInfo;
CREATE TABLE UserInfo (
      Userid varchar(8)  not null, 
      Password varchar(8),
      LastUpdatedDate Date,
      primary key(Userid));


Drop Table ProviderMaster;
CREATE TABLE ProviderMaster(
Prov_Base_Number decimal(7) NOT NULL,
Prov_NPI  varchar(10) NOT NULL,
PROV_TAXONOMY varchar(10),
DEFAULT_IND_PROV_NPI varchar(1),
PROV_SSN_IRS_NUM_IND varchar(1),
PROV_EMPLR_IDENT_NUM_OR_SS_NUM varchar(9),
PROV_SORT_NAME varchar(35),
PROV_COUNTY_CODE varchar(2),
PROV_TYPE varchar(2),
PROV_NAME varchar(35),
OUT_OF_STATE_PROV_CD varchar(1),
PROV_DATE_OF_BIRTH Date,
PROV_TELE_NUM int,
PROV_FAX_NUM int, 
PROV_APPL_COMPLETE_STATUS int,
DATE_OF_LAST_TRANS Date,
CLERK_IDENTIFICATION varchar(8),
primary key(Prov_Base_Number));


Drop Table ProviderAdditionalInfo; 
CREATE TABLE ProviderAdditionalInfo(
PROV_BASE_NUMBER decimal(7)  NOT NULL,
PROV_LICENSE_NUM varchar(9),
PROV_LICENSE_DATE Date,
PROV_LIC_EXPIRE_DATE Date,
PROV_CLIA_ID varchar(10),
TYPE_PRACTICE_ORGAN varchar(2),
PROV_OWNERSHIP_CODE varchar(1),
PROV_APPL_DATE Date,
PROV_TAX_NAME varchar(35),
PROV_AFP_IND varchar(1),
PROV_PRINT_SUSP_IND varchar(1),
PROV_PAYMENT_METHOD varchar(1),
EFT_DFI_ROUTE_ID int,
EFT_DFI_ACCT_NUMBER varchar(17),
EMC_BILLING_IND varchar(1),
PROV_CORRESP_MEDIA varchar(1),
PROV_REMIT_MEDIA varchar(1),
CRITICAL_ACCESS_IND varchar(1),
HOSP_TAX_IND varchar(1),
CREDIT_BAL_AMT Decimal(9,2),
CREDIT_BALANCE_DATE Date,
INIT_CRE_BAL_DATE Date,
LIEN_HOLDER_PROV_NUM Decimal(7),
LIEN_DATE Date,
LIEN_WH_DATE Date,
LIEN_AMOUNT_PAID Decimal(9,2),
LIEN_AMOUNT Decimal(9,2),
ADJUSTMENT_REASON varchar(2),
LIEN_DEDUCT_AMOUNT Decimal(9,2),
LIEN_DEDUCT_PERCENT Decimal(3,2),
RECOUPMENT_AMOUNT Decimal(9,2),
MAX_CHK_BAL_DED_AMT Decimal(9,2),
MAX_CHK_BAL_DED_PCT Decimal(5,4),
PROV_REMIT_ADDR_IND char(1),
PROV_CHECK_ADDR_IND char(1),
PROV_CORRES_ADDR_IND char(1),
PROV_340B_IND char(1),
DATE_OF_LAST_TRANS Date,
CLERK_IDENTIFICATION varchar(8),
primary key(Prov_Base_Number));


Drop Table ProviderAddress;
CREATE TABLE ProviderAddress(
PROV_BASE_NUMBER decimal(7)  NOT NULL,
ADDRESS_NUMBER_IND char(1) NOT NULL,
PROV_ADDR_LINE_1 varchar(28),
PROV_ADDR_LINE_2 varchar(28),
PROV_CITY varchar(18),
PROV_STATE char(2),
PROV_ZIP_CODE Decimal(9),
PROV_EMAIL_ID varchar(50),
Primary key (Prov_Base_Number,ADDRESS_NUMBER_IND)
);

Drop Table ProviderSpeciality;
CREATE TABLE ProviderSpeciality(
PROV_BASE_NUMBER	Decimal(07) NOT NULL,
PROV_SPEC_CODE	char(02) NOT NULL,
PROV_SPEC_CERT_DATE	DATE,
PROV_SPEC_CERT_NUM	varchar(06),
DATE_OF_LAST_TRANS	DATE,
CLERK_IDENTIFICATION	varchar(08),
primary key (Prov_Base_Number,PROV_SPEC_CODE));

Drop table ProviderEnrollmentPeriod;
CREATE TABLE ProviderEnrollmentPeriod(
PROV_BASE_NUMBER	Decimal(7) NOT NULL,
PROV_ENROL_STAT_CD	char(01) NOT NULL,
PROV_SPEC_CERT_DATE	DATE,
PROV_SPEC_CERT_NUM	varchar(06),
DATE_OF_LAST_TRANS	DATE,
CLERK_IDENTIFICATION	varchar(08),
primary key(Prov_Base_Number,PROV_ENROL_STAT_CD));

Drop table ProviderClaimType;
CREATE TABLE ProviderClaimType(
PROV_BASE_NUMBER	Decimal(07) NOT NULL,
BEGIN_CLM_TYPE_DT	DATE NOT NULL,
END_CLM_TYPE_DT	DATE NOT NULL,
CLM_INPUT_FORM_IND_1	char(01),
CLM_INPUT_FORM_IND_2	char(01),
CLM_INPUT_FORM_IND_3	char(01),
CLM_INPUT_FORM_IND_4	char(01),
CLM_INPUT_FORM_IND_5	char(01),
CLM_INPUT_FORM_IND_6	char(01),
CLM_INPUT_FORM_IND_7	char(01),
CLM_INPUT_FORM_IND_8	char(01),
DATE_OF_LAST_TRANS	DATE,
CLERK_IDENTIFICATION	varchar(08),
primary key(Prov_Base_Number,BEGIN_CLM_TYPE_DT,END_CLM_TYPE_DT));

Drop Table ProviderCertification;
CREATE TABLE ProviderCertification(
PROV_BASE_NUMBER	Decimal(07) NOT NULL,
PROV_CERTIF_BEG_DT	DATE,
PROV_CERTIF_END_DT	DATE,
PROV_CERTIF_CD	char(01) NOT NULL,
DATE_OF_LAST_TRANS	DATE,
CLERK_IDENTIFICATION	varchar(08),
primary key(Prov_Base_Number,PROV_CERTIF_CD));

Drop table ProviderGroup;
CREATE TABLE ProviderGroup(
PROV_BASE_NUMBER	Decimal(07)  NOT NULL,
PROV_GROUP	DECIMAL(07) NOT NULL,
PROV_GROUP_BEG_DATE	DATE,
PROV_GROUP_END_DATE	DATE,
DATE_OF_LAST_TRANS	DATE,
CLERK_IDENTIFICATION	varchar(08),
primary key(Prov_Base_Number,PROV_GROUP));









 

 