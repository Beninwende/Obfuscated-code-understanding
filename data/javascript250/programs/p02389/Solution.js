'use strict';
var NS = {};
function addProps(ns) {
    var isBrowser = function() {
        return typeof window !== 'undefined';
    }
    ns.isBrowser = isBrowser;
    
    var isNodejs = function() {
        return ! isBrowser();
    }
    ns.isNodejs = isNodejs;
    
    if (isBrowser()) {
        var getHtmlEncoded = function(string0) {
            return String(string0)
                    .replace(/&/g, '&amp;')
                    .replace(/"/g, '&quot;')
                    .replace(/'/g, '&#39;')
                    .replace(/</g, '&lt;')
                    .replace(/>/g, '&gt;');
        }
        ns.getHtmlEncoded = getHtmlEncoded;
        
        var outputCode = function() {
            document.getElementById('code').innerHTML = '<pre><code>' + getHtmlEncoded(addProps) + '</code></pre>';
        }
        ns.outputCode = outputCode;
    }
    
    var getInput = function() {
        var inputLines = [];
        if (isBrowser()) {
            var html = document.getElementById('input').innerHTML;
            inputLines = html.split('<br>');
        }
        if (isNodejs()) {
            inputLines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split('\n');
        }
        return inputLines;
    }
    
    var doOutput = function(outputLines) {
        if (isBrowser()) {
            document.getElementById('output').innerHTML = outputLines.map(getHtmlEncoded).join('<br>\n');
        }
        if (isNodejs()) {
            for (var i = 0; i < outputLines.length; i++) {
                console.log(outputLines[i]);
            }
        }
    }
    ns.doOutput = doOutput;
    
    var getNthPower = function(r, n) {
        var power = 1;
        for (var i = 0; i < n; i++) {
            power *= r;
        }
        return power;
    }
    var getArea = function(a, b) {
        return a * b;
    }
    var getCircumference  = function(a, b) {
        return a + b + a + b;
    }
    
    var main = function() {
        var inputLines = getInput();
        var line0 = inputLines[0];
        var numStrings = line0.split(' ');
        var nums = [];
        for (var i = 0; i < numStrings.length; i++) {
            nums.push(Number(numStrings[i]));
        }
        var a = nums[0];
        var b = nums[1];
        var area = getArea(a, b);
        var circumference = getCircumference(a, b);
        var outputLine0 = area + ' ' + circumference;
        doOutput([outputLine0]);
    }
    ns.main = main;
}
addProps(NS);
if (NS.isBrowser()) {
    window.onload = function() {
        NS.outputCode();
    }
}
NS.main();