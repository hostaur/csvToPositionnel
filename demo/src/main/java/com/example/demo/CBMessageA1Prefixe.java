/**
 * 
 */
package com.example.demo;

import be.fgov.faofat.infra.copybooks.util.CopyBookMessageAccessor;
import be.fgov.faofat.infra.copybooks.util.DataDescriptionEntry;
import be.fgov.faofat.infra.util.DataType;

/**
 * @author lungwil
 * 
 */
public class CBMessageA1Prefixe extends CopyBookMessageAccessor {

	// Partie r�seau
	private DataDescriptionEntry action;
	private DataDescriptionEntry messageOrigin;
	private DataDescriptionEntry sendType;
	private DataDescriptionEntry constante;
	private DataDescriptionEntry versionPrefixe;
	private DataDescriptionEntry sector;
	private DataDescriptionEntry typeInstitution;
	private DataDescriptionEntry internalReference;
	private DataDescriptionEntry userId;
	private DataDescriptionEntry typeDem;
	private DataDescriptionEntry niss;
	// Partie formulaire
	private DataDescriptionEntry formulaire;
	private DataDescriptionEntry variante;
	private DataDescriptionEntry partieMessage;
	// Partie gestion r�ponse
	private DataDescriptionEntry identificationApplication;
	private DataDescriptionEntry referenceInterneRepondeur;
	private DataDescriptionEntry sendDate;
	private DataDescriptionEntry delaiReponse;
	private DataDescriptionEntry actionTimeout;
	private DataDescriptionEntry reussiteFlux;
	// Partie r�pertoire
	private DataDescriptionEntry qualityCode;
	private DataDescriptionEntry phase;
	private DataDescriptionEntry integrationStart;
	private DataDescriptionEntry integrationEnd;
	private DataDescriptionEntry messageStart;
	private DataDescriptionEntry messageEnd;
	private DataDescriptionEntry secteurFournisseur;
	private DataDescriptionEntry institutionFournisseur;

	public CBMessageA1Prefixe() {

		action = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 1);
		addElement(action);

		messageOrigin = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 1);
		addElement(messageOrigin);

		sendType = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 1);
		addElement(sendType);

		constante = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 4);
		addElement(constante);

		versionPrefixe = new DataDescriptionEntry(null, DataType.ALPHANUMERIC,
				2);
		addElement(versionPrefixe);

		sector = new DataDescriptionEntry(null, DataType.NUMERIC, 3);
		addElement(sector);

		typeInstitution = new DataDescriptionEntry(null, DataType.NUMERIC, 3);
		addElement(typeInstitution);

		internalReference = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 15);
		addElement(internalReference);

		userId = new DataDescriptionEntry(null, DataType.NUMERIC, 11);
		addElement(userId);

		typeDem = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 3);
		addElement(typeDem);

		niss = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 11);
		addElement(niss);

		formulaire = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 4);
		addElement(formulaire);

		variante = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 4);
		addElement(variante);

		partieMessage = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 5);
		addElement(partieMessage);

		identificationApplication = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 8);
		addElement(identificationApplication);

		referenceInterneRepondeur = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 15);
		addElement(referenceInterneRepondeur);

		sendDate = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 10);
		addElement(sendDate);

		delaiReponse = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 3);
		addElement(delaiReponse);

		actionTimeout = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 1);
		addElement(actionTimeout);

		reussiteFlux = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 1);
		addElement(reussiteFlux);

		qualityCode = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 3);
		addElement(qualityCode);

		phase = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 2);
		addElement(phase);

		integrationStart = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 8);
		addElement(integrationStart);

		integrationEnd = new DataDescriptionEntry(null, DataType.ALPHANUMERIC,
				8);
		addElement(integrationEnd);

		messageStart = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 8);
		addElement(messageStart);

		messageEnd = new DataDescriptionEntry(null, DataType.ALPHANUMERIC, 8);
		addElement(messageEnd);

		secteurFournisseur = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 3);
		addElement(secteurFournisseur);

		institutionFournisseur = new DataDescriptionEntry(null,
				DataType.ALPHANUMERIC, 3);
		addElement(institutionFournisseur);

	}

	public DataDescriptionEntry getAction() {
		return action;
	}

	public void setAction(DataDescriptionEntry action) {
		this.action = action;
	}

	public DataDescriptionEntry getMessageOrigin() {
		return messageOrigin;
	}

	public void setMessageOrigin(DataDescriptionEntry messageOrigin) {
		this.messageOrigin = messageOrigin;
	}

	public DataDescriptionEntry getSendType() {
		return sendType;
	}

	public void setSendType(DataDescriptionEntry sendType) {
		this.sendType = sendType;
	}

	public DataDescriptionEntry getConstante() {
		return constante;
	}

	public void setConstante(DataDescriptionEntry constante) {
		this.constante = constante;
	}

	public DataDescriptionEntry getVersionPrefixe() {
		return versionPrefixe;
	}

	public void setVersionPrefixe(DataDescriptionEntry versionPrefixe) {
		this.versionPrefixe = versionPrefixe;
	}

	public DataDescriptionEntry getSector() {
		return sector;
	}

	public void setSector(DataDescriptionEntry sector) {
		this.sector = sector;
	}

	public DataDescriptionEntry getTypeInstitution() {
		return typeInstitution;
	}

	public void setTypeInstitution(DataDescriptionEntry typeInstitution) {
		this.typeInstitution = typeInstitution;
	}

	public DataDescriptionEntry getInternalReference() {
		return internalReference;
	}

	public void setInternalReference(DataDescriptionEntry internalReference) {
		this.internalReference = internalReference;
	}

	public DataDescriptionEntry getUserId() {
		return userId;
	}

	public void setUserId(DataDescriptionEntry userId) {
		this.userId = userId;
	}

	public DataDescriptionEntry getTypeDem() {
		return typeDem;
	}

	public void setTypeDem(DataDescriptionEntry typeDem) {
		this.typeDem = typeDem;
	}

	public DataDescriptionEntry getNiss() {
		return niss;
	}

	public void setNiss(DataDescriptionEntry niss) {
		this.niss = niss;
	}

	public DataDescriptionEntry getFormulaire() {
		return formulaire;
	}

	public void setFormulaire(DataDescriptionEntry formulaire) {
		this.formulaire = formulaire;
	}

	public DataDescriptionEntry getVariante() {
		return variante;
	}

	public void setVariante(DataDescriptionEntry variante) {
		this.variante = variante;
	}

	public DataDescriptionEntry getPartieMessage() {
		return partieMessage;
	}

	public void setPartieMessage(DataDescriptionEntry partieMessage) {
		this.partieMessage = partieMessage;
	}

	public DataDescriptionEntry getIdentificationApplication() {
		return identificationApplication;
	}

	public void setIdentificationApplication(
			DataDescriptionEntry identificationApplication) {
		this.identificationApplication = identificationApplication;
	}

	public DataDescriptionEntry getReferenceInterneRepondeur() {
		return referenceInterneRepondeur;
	}

	public void setReferenceInterneRepondeur(
			DataDescriptionEntry referenceInterneRepondeur) {
		this.referenceInterneRepondeur = referenceInterneRepondeur;
	}

	public DataDescriptionEntry getSendDate() {
		return sendDate;
	}

	public void setSendDate(DataDescriptionEntry sendDate) {
		this.sendDate = sendDate;
	}

	public DataDescriptionEntry getDelaiReponse() {
		return delaiReponse;
	}

	public void setDelaiReponse(DataDescriptionEntry delaiReponse) {
		this.delaiReponse = delaiReponse;
	}

	public DataDescriptionEntry getActionTimeout() {
		return actionTimeout;
	}

	public void setActionTimeout(DataDescriptionEntry actionTimeout) {
		this.actionTimeout = actionTimeout;
	}

	public DataDescriptionEntry getReussiteFlux() {
		return reussiteFlux;
	}

	public void setReussiteFlux(DataDescriptionEntry reussiteFlux) {
		this.reussiteFlux = reussiteFlux;
	}

	public DataDescriptionEntry getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(DataDescriptionEntry qualityCode) {
		this.qualityCode = qualityCode;
	}

	public DataDescriptionEntry getPhase() {
		return phase;
	}

	public void setPhase(DataDescriptionEntry phase) {
		this.phase = phase;
	}

	public DataDescriptionEntry getIntegrationStart() {
		return integrationStart;
	}

	public void setIntegrationStart(DataDescriptionEntry integrationStart) {
		this.integrationStart = integrationStart;
	}

	public DataDescriptionEntry getIntegrationEnd() {
		return integrationEnd;
	}

	public void setIntegrationEnd(DataDescriptionEntry integrationEnd) {
		this.integrationEnd = integrationEnd;
	}

	public DataDescriptionEntry getMessageStart() {
		return messageStart;
	}

	public void setMessageStart(DataDescriptionEntry messageStart) {
		this.messageStart = messageStart;
	}

	public DataDescriptionEntry getMessageEnd() {
		return messageEnd;
	}

	public void setMessageEnd(DataDescriptionEntry messageEnd) {
		this.messageEnd = messageEnd;
	}

	public DataDescriptionEntry getSecteurFournisseur() {
		return secteurFournisseur;
	}

	public void setSecteurFournisseur(DataDescriptionEntry secteurFournisseur) {
		this.secteurFournisseur = secteurFournisseur;
	}

	public DataDescriptionEntry getInstitutionFournisseur() {
		return institutionFournisseur;
	}

	public void setInstitutionFournisseur(
			DataDescriptionEntry institutionFournisseur) {
		this.institutionFournisseur = institutionFournisseur;
	}

}
