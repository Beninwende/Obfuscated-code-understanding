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
    
    var getHMS = function(s) {
        var result = {};
        result.seconds = s % 60;
        s = Math.floor(s / 60);
        result.minutes = s % 60;
        s = Math.floor(s / 60);
        result.hours = s;
        return result;
    }
    
    var main = function() {
        var inputLines = getInput();
        var s = Number(inputLines[0]);
        var result = getHMS(s);
        var string0 = result.hours + ':' + result.minutes + ':' + result.seconds;
        doOutput([string0]);
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