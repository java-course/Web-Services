
package ru.javacourse.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "airportSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AirportSoap {


    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv, CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds and longitude E/W by ISO country code 
     * 
     * @param countryAbbrviation
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.webserviceX.NET/getAirportInformationByISOCountryCode")
    @WebResult(name = "getAirportInformationByISOCountryCodeResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "getAirportInformationByISOCountryCode", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByISOCountryCode")
    @ResponseWrapper(localName = "getAirportInformationByISOCountryCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByISOCountryCodeResponse")
    public String getAirportInformationByISOCountryCode(
        @WebParam(name = "CountryAbbrviation", targetNamespace = "http://www.webserviceX.NET")
        String countryAbbrviation);

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv, CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds and longitude E/W by city or airport name 
     * 
     * @param cityOrAirportName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.webserviceX.NET/getAirportInformationByCityOrAirportName")
    @WebResult(name = "getAirportInformationByCityOrAirportNameResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "getAirportInformationByCityOrAirportName", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByCityOrAirportName")
    @ResponseWrapper(localName = "getAirportInformationByCityOrAirportNameResponse", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByCityOrAirportNameResponse")
    public String getAirportInformationByCityOrAirportName(
        @WebParam(name = "cityOrAirportName", targetNamespace = "http://www.webserviceX.NET")
        String cityOrAirportName);

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv, CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds and longitude E/W by country name 
     * 
     * @param country
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAirportInformationByCountry", action = "http://www.webserviceX.NET/GetAirportInformationByCountry")
    @WebResult(name = "GetAirportInformationByCountryResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetAirportInformationByCountry", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByCountry")
    @ResponseWrapper(localName = "GetAirportInformationByCountryResponse", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByCountryResponse")
    public String getAirportInformationByCountry(
        @WebParam(name = "country", targetNamespace = "http://www.webserviceX.NET")
        String country);

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv, CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds and longitude E/W by airport code 
     * 
     * @param airportCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.webserviceX.NET/getAirportInformationByAirportCode")
    @WebResult(name = "getAirportInformationByAirportCodeResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "getAirportInformationByAirportCode", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByAirportCode")
    @ResponseWrapper(localName = "getAirportInformationByAirportCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "ru.javacourse.webservice.client.GetAirportInformationByAirportCodeResponse")
    public String getAirportInformationByAirportCode(
        @WebParam(name = "airportCode", targetNamespace = "http://www.webserviceX.NET")
        String airportCode);

}