/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ct.box.retriever

import uk.gov.hmrc.ct._

object FilingAttributesBoxValueRetriever extends BoxValues[FilingAttributesBoxValueRetriever]

trait FilingAttributesBoxValueRetriever extends BoxRetriever {

  def retrieveProductName(): ProductName

  def retrieveCompanyType(): FilingCompanyType

  def retrieveAbbreviatedAccountsFiling(): AbbreviatedAccountsFiling

  def retrieveAbridgedFiling(): AbridgedFiling

  def retrieveCompaniesHouseFiling(): CompaniesHouseFiling

  def retrieveHMRCFiling(): HMRCFiling

  def retrieveHMRCAmendment(): HMRCAmendment

  def retrieveMicroEntityFiling(): MicroEntityFiling

  def retrieveStatutoryAccountsFiling(): StatutoryAccountsFiling

  def retrieveUTR(): UTR
}
