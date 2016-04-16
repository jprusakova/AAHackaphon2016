package com.aa.team11.controllers;

import com.aa.team11.dtos.FlightInfo;
import com.aa.team11.dtos.Location;
import com.aa.team11.dtos.LocationInfo;
import com.aa.team11.mockServices.LocationMockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jordanculver on 4/15/16.
 */
@Controller
@RequestMapping("/findMyFlight")
public class FindMyFlightController {

    @RequestMapping(value = "/getFlightInfo", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public FlightInfo getFlightInfo(@RequestParam("pnr") String pnr) {
        return new FlightInfo("123456", "T2", "A1", "2:45PM", "3:15PM", "S12");
    }

    @RequestMapping(value = "/getLocation", method = RequestMethod.GET)
    @ResponseBody
    public LocationInfo findByWirelessNetwork(@RequestParam("wirelessNetworkId") String wirelessNetworkId) {
        return LocationMockService.createLocation(wirelessNetworkId);
    }

    @RequestMapping(value = "/getTimeToGate", method = RequestMethod.POST)
    @ResponseBody
    public long getTimeToGate(@RequestBody FlightInfo flightInfo, Location location) {
        return 200000l;
    }
}
